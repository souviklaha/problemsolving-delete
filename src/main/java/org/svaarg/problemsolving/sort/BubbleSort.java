package org.svaarg.problemsolving.sort;

import org.svaarg.problemsolving.util.Utility;

/**
 * Class: BubbleSort
 *
 * @author Umang J Gala
 */
public class BubbleSort {
  public static void sort(int[] elements) {
    for (int element = elements.length - 1; element >= 0; element--) {
      for (int index = 0; index < element; index++) {
        if (elements[index] > elements[index + 1]) {
          Utility.swapArrayElements(elements, index, index + 1);
        }
      }
    }
  }
}
