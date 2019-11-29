package org.svaarg.problemsolving.sort;

import org.svaarg.problemsolving.util.Utility;

/**
 * Class: SelectionSort
 *
 * @author Umang J Gala
 */
public class SelectionSort {
  /**
   * Selection sort algorithm
   *
   * @param elements elements to sort
   */
  public static void sort(int[] elements) {
    int minimum, minimumIndex;
    for (int element = 0; element < elements.length - 1; element++) {
      minimum = elements[element];
      minimumIndex = element;
      for (int index = element + 1; index < elements.length; index++) {
        if (elements[index] < minimum) {
          minimum = elements[index];
          minimumIndex = index;
        }
      }
      Utility.swapArrayElements(elements, element, minimumIndex);
    }
  }
}
