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

import android.util.Log;

/**
 * @author Patrick Woodworth
 */
class LOG {

  public static final boolean LOGGING_ENABLED = false;

  private static final String LOGGING_CATEGORY = "MORSEKB";

  public static void debug(String msg) {
    if (LOGGING_ENABLED)
      Log.d(LOGGING_CATEGORY, msg);
  }

  public static void debug(String msg, Object... args) {
    if (LOGGING_ENABLED)
      Log.d(LOGGING_CATEGORY, String.format(msg, args));
  }

  public static void debug(Throwable e, String msg) {
    if (LOGGING_ENABLED)
      Log.d(LOGGING_CATEGORY, msg, e);
  }

  public static void info(String msg) {
    if (LOGGING_ENABLED)
      Log.i(LOGGING_CATEGORY, msg);
  }

  public static void info(String msg, Object... args) {
    if (LOGGING_ENABLED)
      Log.i(LOGGING_CATEGORY, String.format(msg, args));
  }

  public static void info(Throwable e, String msg) {
    if (LOGGING_ENABLED)
      Log.i(LOGGING_CATEGORY, msg, e);
  }

  public static void warn(String msg) {
    if (LOGGING_ENABLED)
      Log.w(LOGGING_CATEGORY, msg);
  }

  public static void warn(String msg, Object... args) {
    if (LOGGING_ENABLED)
      Log.w(LOGGING_CATEGORY, String.format(msg, args));
  }

  public static void warn(Throwable e, String msg) {
    if (LOGGING_ENABLED)
      Log.w(LOGGING_CATEGORY, msg, e);
  }

  public static void error(String msg) {
    if (LOGGING_ENABLED)
      Log.e(LOGGING_CATEGORY, msg);
  }

  public static void error(String msg, Object... args) {
    if (LOGGING_ENABLED)
      Log.e(LOGGING_CATEGORY, String.format(msg, args));
  }

  public static void error(Throwable e, String msg) {
    if (LOGGING_ENABLED)
      Log.e(LOGGING_CATEGORY, msg, e);
  }
}
