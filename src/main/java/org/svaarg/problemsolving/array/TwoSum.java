package org.svaarg.problemsolving.array;

import java.util.HashMap;

/**
 * Class: TwoSum
 * Find indices of the two numbers such that they add up to a specific target
 *
 * @author Umang J Gala
 */
class TwoSum {
  /**
   * twoSum
   * function to return two indices of the two numbers that add up to target
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
    return new int[]{-1, -1};
  }
}
