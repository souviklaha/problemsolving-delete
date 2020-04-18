package org.swaarg.problemsolving.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * LongestSubstringTest
 *
 * @author Umang G
 */
class LongestSubstringTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("abcabcbb", 3),
        Arguments.of("bbbbb", 1),
        Arguments.of("pwwkew", 3)
    );
  }

  @ParameterizedTest
  @MethodSource("testCases")
  public void testLengthOfLongestSubstringWithoutRepeatingCharBruteForce(String input, int expected) {
      assertEquals(expected,LongestSubstring.lengthOfLongestSubstringWithoutRepeatingCharBruteForce(input));
  }
}