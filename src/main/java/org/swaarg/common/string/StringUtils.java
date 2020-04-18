package org.swaarg.common.string;

import java.util.HashSet;
import java.util.Set;

/**
 * StringUtils
 *
 * @author Umang G
 */
public class StringUtils {
  public static boolean checkAllUnique(String s, int start, int end) {
    Set<Character> set = new HashSet<>();
    for (int i = start; i < end; i++) {
      Character c = s.charAt(i);
      if (!set.add(c))
        return false;
    }
    return true;
  }
}