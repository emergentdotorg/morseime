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

/* The following code was written by Matthew Wiggins
 * and is released under the APACHE 2.0 license
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.emergent.android.morseime;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;


public class HelpPreference extends DialogPreference {

  public HelpPreference(Context context, AttributeSet attrs) {
    super(context, attrs);
    setDialogLayoutResource(R.layout.help);
    setPositiveButtonText(android.R.string.ok);
    setNegativeButtonText(android.R.string.cancel);
  }
}