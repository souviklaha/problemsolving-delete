package org.swaarg.problemsolving.leetcode;

import org.swaarg.common.string.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

  public static int lengthOfLongestSubstringWithoutRepeatingCharSlidingWindow(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {          // try to extend the range [i, j]
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);
      } else
        set.remove(s.charAt(i++));
    }
    return ans;
  }

  public static int lengthOfLongestSubstringWithoutRepeatingCharSlidingWindowOptimized(String s) {
    int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>();  // current index of character
    for (int j = 0, i = 0; j < n; j++) {            // try to extend the range [i, j]
      if (map.containsKey(s.charAt(j)))
        i = Math.max(map.get(s.charAt(j)), i);
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }
}
