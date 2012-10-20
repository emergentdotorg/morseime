
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

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/**
 * @author Patrick Woodworth
 */
public class MorseKeyboardView extends KeyboardView {

  static final int KEYCODE_OPTIONS = -100;
  static final int KEYCODE_SHIFT_LONGPRESS = -101;
  static final int KEYCODE_DIT = -102;
  static final int KEYCODE_DAH = -103;

  private Keyboard mPhoneKeyboard;

  public MorseKeyboardView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MorseKeyboardView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  public void setPhoneKeyboard(Keyboard phoneKeyboard) {
    mPhoneKeyboard = phoneKeyboard;
  }

  @Override
  protected boolean onLongPress(Key key) {
    if (key.codes[0] == Keyboard.KEYCODE_MODE_CHANGE) {
      getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
      return true;
    } else if (key.codes[0] == Keyboard.KEYCODE_SHIFT) {
      getOnKeyboardActionListener().onKey(KEYCODE_SHIFT_LONGPRESS, null);
      invalidateAllKeys();
      return true;
    } else if (key.codes[0] == '0' && getKeyboard() == mPhoneKeyboard) {
      // Long pressing on 0 in phone number keypad gives you a '+'.
      getOnKeyboardActionListener().onKey('+', null);
      return true;
    } else {
      return super.onLongPress(key);
    }
  }
}
