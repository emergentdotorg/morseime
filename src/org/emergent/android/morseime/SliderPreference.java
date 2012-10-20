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
import android.graphics.drawable.Drawable;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * @author Patrick Woodworth
 */
public class SliderPreference extends DialogPreference
    implements SeekBar.OnSeekBarChangeListener {

  private static final String androidns = "http://schemas.android.com/apk/res/android";

  private Drawable mMyIcon;

  private TextView mValueText;
  private SeekBar mSeekBar;

  private final String mSuffix;
  private final int mMin;
  private final int mMax;
  private final int mDefault;


  private int mOldValue;


  public SliderPreference(Context context, AttributeSet attrs) {
    super(context, attrs);

    setDialogLayoutResource(R.layout.slider_pref);
    setPositiveButtonText(android.R.string.ok);
    setNegativeButtonText(android.R.string.cancel);

    // Steal the XML dialogIcon attribute's value
    mMyIcon = getDialogIcon();
    setDialogIcon(null);


//    mMin = 0;
    mMin = attrs.getAttributeIntValue(null, "min", 0);
//    mMin = attrs.getAttributeIntValue(androidns, "min", 0);
    mMax = attrs.getAttributeIntValue(androidns, "max", 100);
    mSuffix = attrs.getAttributeValue(androidns, "text");
    mDefault = attrs.getAttributeIntValue(androidns, "defaultValue", 0);

    mOldValue = shouldPersist() ? getPersistedInt(mDefault) : mDefault;
    setPrefValue(mOldValue);
  }

  @Override
  protected void onSetInitialValue(boolean restore, Object defaultValue) {
    super.onSetInitialValue(restore, defaultValue);
    setValueWidgets(getUnitized());
  }

  @Override
  protected void onBindDialogView(View view) {
    super.onBindDialogView(view);

    final ImageView iconView = (ImageView) view.findViewById(R.id.icon);
    if (mMyIcon != null) {
      iconView.setImageDrawable(mMyIcon);
    } else {
      iconView.setVisibility(View.GONE);
    }

    mValueText = (TextView) view.findViewById(R.id.seeklabel);
    mSeekBar = getSeekBar(view);
    mSeekBar.setMax(mMax - mMin);
    mOldValue = shouldPersist() ? getPersistedInt(mDefault) : mDefault;
    mSeekBar.setProgress(mOldValue - mMin);
    mSeekBar.setOnSeekBarChangeListener(this);
    setPrefValue(mOldValue);
  }

  @Override
  protected void onDialogClosed(boolean positiveResult) {
    super.onDialogClosed(positiveResult);
    if (positiveResult) {
      if (shouldPersist())
        persistInt(mSeekBar.getProgress() + mMin);
    } else {
      setPrefValue(mOldValue);
    }
  }

  public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
    setPrefValue(progress + mMin);
  }

  public void onStartTrackingTouch(SeekBar seekBar) {
    // NA
  }

  public void onStopTrackingTouch(SeekBar seekBar) {
    // NA
  }  

  protected void setPrefValue(int value) {
    setValueWidgets(getUnitized(value));
    // If pref saved elsewhere set it here
  }

  protected void setValueWidgets(String unitized) {
    if (mValueText != null)
      mValueText.setText(unitized);
    setSummary(unitized);
  }

  protected String getUnitized() {
    return getUnitized(getPersistedInt(mDefault));
  }

  protected String getUnitized(int val) {
    return val + (mSuffix != null ? mSuffix : "");
  }

  protected static SeekBar getSeekBar(View dialogView) {
    return (SeekBar) dialogView.findViewById(R.id.seekbar);
  }
}
