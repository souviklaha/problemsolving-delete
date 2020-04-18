package org.swaarg.problemsolving.leetcode;

import org.swaarg.common.string.StringUtils;

/**
 * LongestSubstring
 *
 * @author Umang G
 */
public class LongestSubstring {
  public static int lengthOfLongestSubstringWithoutRepeatingCharBruteForce(String s) {
    int lengthOfLongestSubstring = 0;
    int strLength = s.length();
    for (int i = 0; i < strLength; i++)
      for (int j = i + 1; j <= strLength; j++)
        if (StringUtils.checkAllUnique(s, i, j))
          lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, j - i);
    return lengthOfLongestSubstring;
  }
}
