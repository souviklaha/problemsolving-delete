package org.svaarg.problemsolving.leetcode;

// Author : Umang J Gala
// Date   : 12-Feb-2019

/*
Problem Statement
-----------------
Given an array of integers, return indices of the two numbers such that they
add up to a specific target.

You may assume that each input would have exactly one solution, and you may
not use the same element twice.

Input Format
------------
The first line contains two integers - first is size of the array and second
is target element. The second line contains integer array elements separated
by space

Output Format
-------------
The output contains two indices of the two numbers that add up to target
separated by space

Sample Input 1:
4 9
2 7 11 15

Sample Output 1:
0 1

Sample Input 2:
5 18
6 2 8 4 3

Sample Output 2:
0 0

 */

import java.util.HashMap;

/**
 * Class TwoSum
 * Find indices of the two numbers such that they add up to a specific target
 *
 * @author Umang J Gala
 */
class TwoSum {
  /**
   * Return two indices of the two numbers that add up to target
   *
   * @param elements array elements
   * @param target   target value
   * @return array of two indices
   */
  int[] twoSum(int[] elements, int target) {
    if (elements == null || elements.length < 2)
      return new int[]{0, 0};
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int index = 0; index < elements.length; index++) {
      if (map.containsKey(elements[index])) {
        return new int[]{map.get(elements[index]), index};
      } else {
        map.put(target - elements[index], index);
      }
    }
    return new int[]{0, 0};
  }
}
