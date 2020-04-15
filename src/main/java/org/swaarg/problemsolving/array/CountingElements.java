package org.swaarg.problemsolving.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Class: CountingElements
 * Count the element x such that x + 1 element is present in the same array
 *
 * @author Umang J Gala
 */
public class CountingElements {
  /**
   * countElements
   * count the element x such that x + 1 element is present in the same array
   *
   * @param arr array elements
   * @return count of x elements
   */
  int countElements(int[] arr) {
    int count = 0;
    Set<Integer> elements = new HashSet<>();
    for (int element : arr)
      elements.add(element);
    for (int x : arr)
      if (elements.contains(x + 1))
        count++;
    return count;
  }
}
