package org.svaarg.problemsolving.util;

/**
 * Class: Utility.java
 *
 * @author Umang J Gala
 */
public class Utility {
  /**
   * Swap the given to element in an given array.
   *
   * @param array     array of elements
   * @param indexOne  element to be swapped
   * @param indexTwo  element to be swapped with
   */
  public static void swapArrayElements(char[] array, int indexOne, int indexTwo) {
    char temporary = array[indexOne];
    array[indexOne] = array[indexTwo];
    array[indexTwo] = temporary;
  }
}
