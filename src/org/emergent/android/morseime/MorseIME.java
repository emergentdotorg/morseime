/*
 * Copyright (c) 2010 Patrick Woodworth
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.emergent.android.morseime;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * @author Patrick Woodworth
 */
public class MorseIME extends LatinIME {

  private static final String PREF_WORDS_PER_MINUTE = "words_per_minute";
  private static final String PREF_AUTO_SPACE_ON = "auto_space_on";
  private static final String PREF_FORCE_VISIBLE = "force_visible";

  private static final int WPM_MILLIS_EQUATION_NUMERATOR = 1200;
  private static final int CHAR_SEP_UNITS = 3;
  private static final int WORD_SEP_UNITS = 7;
  private static final int DEFAULT_WPM = 10;

  private DitDahHandlerCallback m_ditDahHandlerCallback = new DitDahHandlerCallback();

  private boolean m_forceVisible = true;
  private boolean m_autoSpace = false;
  private long m_wpm = 10;

  @Override
  public boolean onEvaluateInputViewShown() {
    return m_forceVisible || super.onEvaluateInputViewShown();
  }

  @Override
  public void onFinishInput() {
    super.onFinishInput();
    m_ditDahHandlerCallback.reset();
  }

  @Override
  public void onKey(int primaryCode, int[] keyCodes) {
    if (m_ditDahHandlerCallback.handleKeyPress(primaryCode))
      return;
    else
      super.onKey(primaryCode, keyCodes);
  }

  @Override
  protected void loadSettings() {
    super.loadSettings();
    // Get the settings preferences
    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
    m_forceVisible = sp.getBoolean(PREF_FORCE_VISIBLE, true);
    m_autoSpace = sp.getBoolean(PREF_AUTO_SPACE_ON, false);
    m_wpm = sp.getInt(PREF_WORDS_PER_MINUTE, DEFAULT_WPM);
  }


  public class DitDahHandlerCallback implements Runnable {

    private final StringBuilder m_ditDahBuf = new StringBuilder();

    private long m_lastDitOrDah = 0;

    private boolean m_registered = false;

    public DitDahHandlerCallback() {
    }

    public void run() {
      long curTime = System.currentTimeMillis();
      try {
        synchronized (m_ditDahBuf) {
          long elapsed = curTime - m_lastDitOrDah;
          if (elapsed < calcMillis(CHAR_SEP_UNITS))
            return;

          if (m_ditDahBuf.length() == 0) {
            if (!m_autoSpace || m_lastDitOrDah == 0 || elapsed < calcMillis(WORD_SEP_UNITS))
              return;
            m_lastDitOrDah = 0;
            getCurrentInputConnection().commitText(String.valueOf((char) ' '), 1);
//            sendKey(' ');
          } else {
            String encoding = m_ditDahBuf.toString();
            m_ditDahBuf.setLength(0);
            try {
              MorseDigraph digraph = MorseDigraph.valueOfEncoding(encoding);
              char theChar = digraph.getChar();
              if (mKeyboardSwitcher.mInputView.getKeyboard().isShifted())
                theChar = Character.toUpperCase(theChar);
              getCurrentInputConnection().commitText(String.valueOf(theChar), 1);
//              sendKey(digraph.getChar());
            } catch (IllegalArgumentException e) {
              LOG.warn(e, e.getMessage());
            }
          }
        }
      } finally {
        mHandler.postDelayed(this, 200);
      }
    }

    public boolean handleKeyPress(int primaryCode) {
      if (primaryCode == MorseKeyboardView.KEYCODE_DIT || primaryCode == MorseKeyboardView.KEYCODE_DAH) {
        m_ditDahHandlerCallback.recordDitOrDah(primaryCode == MorseKeyboardView.KEYCODE_DIT);
        return true;
      } else {
        m_ditDahHandlerCallback.reset();
        return false;
      }
    }

    public void reset() {
      synchronized (m_ditDahBuf) {
        mHandler.removeCallbacks(this);
        m_lastDitOrDah = 0;
        m_ditDahBuf.setLength(0);
        m_registered = false;
      }
    }

    private void recordDitOrDah(boolean isDit) {
      synchronized (m_ditDahBuf) {
        m_lastDitOrDah = System.currentTimeMillis();
        m_ditDahBuf.append(isDit ? '.' : '-');
        if (!m_registered) {
          mHandler.removeCallbacks(this);
          mHandler.postDelayed(this, 200);
          m_registered = true;
        }
      }
    }

    private long calcMillis(int units) {
      return (WPM_MILLIS_EQUATION_NUMERATOR * units) / m_wpm;
    }
  }
}
