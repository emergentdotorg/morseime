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

import java.util.EnumSet;

/**
 * @author Patrick Woodworth
 */
public enum MorseDigraph {

  ALPHA_A('a', ".-"),
  ALPHA_B('b', "-..."),
  ALPHA_C('c', "-.-."),
  ALPHA_D('d', "-.."),
  ALPHA_E('e', "."),
  ALPHA_F('f', "..-."),
  ALPHA_G('g', "--."),
  ALPHA_H('h', "...."),
  ALPHA_I('i', ".."),
  ALPHA_J('j', ".---"),
  ALPHA_K('k', "-.-"),
  ALPHA_L('l', ".-.."),
  ALPHA_M('m', "--"),
  ALPHA_N('n', "-."),
  ALPHA_O('o', "---"),
  ALPHA_P('p', ".--."),
  ALPHA_Q('q', "--.-"),
  ALPHA_R('r', ".-."),
  ALPHA_S('s', "..."),
  ALPHA_T('t', "-"),
  ALPHA_U('u', "..-"),
  ALPHA_V('v', "...-"),
  ALPHA_W('w', ".--"),
  ALPHA_X('x', "-..-"),
  ALPHA_Y('y', "-.--"),
  ALPHA_Z('z', "--.."),
  DIGIT_0('0', "-----"),
  DIGIT_1('1', ".----"),
  DIGIT_2('2', "..---"),
  DIGIT_3('3', "...--"),
  DIGIT_4('4', "....-"),
  DIGIT_5('5', "....."),
  DIGIT_6('6', "-...."),
  DIGIT_7('7', "--..."),
  DIGIT_8('8', "---.."),
  DIGIT_9('9', "----."),
  PERIOD('.', ".-.-.-"),
  COMMA(',', "--..--"),
  QUESTION_MARK('?', "..--.."),
  APOSTROPHE('\'', ".----."),
  EXCLAMATION_MARK('!', "-.-.--"),
  SLASH('/', "-..-."),
  PAREN_OPEN('(', "	-.--."),
  PAREN_CLOSE(')', "-.--.-"),
  AMPERSAND('&', ".-..."),
  COLON(':', "---..."),
  SEMICOLON(';', "-.-.-."),
  DOUBLE_DASH('-', "-...-"), // todo correct this
  PLUS('+', ".-.-."),
  MINUS('-', "-....-"),
  UNDERSCORE('_', "..--.-"),
  QUOTATION_MARK('\"', ".-..-."),
  DOLLAR_SIGN('$', "...-..-"),
  AT_SIGN('@', ".--.-."),
  ;

  private final char m_char;
  private final String m_encoding;

  MorseDigraph(char aChar, String encoding) {
    m_char = aChar;
    m_encoding = encoding;
  }

  public char getChar() {
    return m_char;
  }  
  
  public String getEncoding() {
    return m_encoding;
  }

  public static MorseDigraph valueOfEncoding(String encoding) {
    for (MorseDigraph digraph : EnumSet.allOf(MorseDigraph.class)) {
      if (digraph.m_encoding.equals(encoding))
        return digraph;
    }
    throw new IllegalArgumentException("Invalid digraph encoding \"" + encoding + "\"");
  }
}
