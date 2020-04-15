package org.swaarg.problemsolving.util;

/**
 * Class: Utility.java
 *
 * @author Umang J Gala
 */
public class Utility {

  /**
   * Returns the maximum of three elements.
   * If all three are same then returns the third element.
   *
   * @param three third element
   * @param  one    first element
   * @param  two    second element
   * @return int    maximum of three
   */
  public static int maximum(int one, int two, int three) {
    // If one is larger or one and two are equal.
    if (one >= two && one > three) return one;
      // If two is larger.
    else if (two > one && two > three) return two;
      // If three is larger.
    else return three;
  }

  /**
   * Returns the minimum of three elements.
   * If all three are same then returns the third element.
   *
   * @param  one    first element
   * @param  two    second element
   * @param  three  third element
   * @return int    minimum of three
   */
  public static int minimum(int one, int two, int three) {
    // If one is smaller or one and two are equal.
    if (one <= two && one < three) return one;
      // If two is smaller.
    else if (two < one && two < three) return two;
      // If three is smaller.
    else return three;
  }

  /**
   * Swap the given to element in an given array.
   *
   * @param array     array of elements
   * @param indexOne  element to be swapped
   * @param indexTwo  element to be swapped with
   */
  public static void swapArrayElements(int[] array, int indexOne, int indexTwo) {
    int temporary = array[indexOne];
    array[indexOne] = array[indexTwo];
    array[indexTwo] = temporary;
  }

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
