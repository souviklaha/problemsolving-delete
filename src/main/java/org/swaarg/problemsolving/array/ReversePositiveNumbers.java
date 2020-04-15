package org.swaarg.problemsolving.array;

/**
 * Class: ReversePositiveNumbers
 * Reverse all consecutive positive numbers between negative numbers
 *
 * @author Umang J Gala
 */
class ReversePositiveNumbers {

  /**
   * reversePositiveNos
   * function to reverse all consecutive positive integers between the
   * negative numbers.
   *
   * @param array elements
   */
  void reversePositiveNos(int[] array) {
    int start = 0;
    int element = 1;
    while (element < array.length) {
      if (array[element] <= 0) {
        if (start != element - 1) {
          if (array[start] <= 0)
            start++;
          reverse(array, start, element - 1);
        }
        start = ++element;
      }
      element++;
    }
    if (start < array.length)
      reverse(array, start, element - 1);
  }

  /**
   * reverse
   * function to reverse the array elements between start and end
   * (inclusive) range.
   *
   * @param array elements
   * @param start starting index
   * @param end   ending index
   */
  private void reverse(int[] array, int start, int end) {
    while (end > start) {
      int swapElement = array[start];
      array[start] = array[end];
      array[end] = swapElement;
      start++;
      end--;
    }
  }
}
