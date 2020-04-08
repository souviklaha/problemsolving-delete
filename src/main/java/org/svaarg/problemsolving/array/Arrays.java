package org.svaarg.problemsolving.array;

/**
 * Class: Arrays
 * Array utility to perform following
 * - createIntArray from string of space separated integers
 *
 * @author Umang J Gala
 */
public class Arrays {
  /**
   * createIntArray (static method)
   * function to create int array from integers passes in string separated by
   * space
   * Assumption:
   * valid numbers are passed only, else may throw NumberFormatException
   *
   * @param arrElements string of array elements
   * @return int array
   */
  public static int[] createIntArray(String arrElements) {
    String[] elements = arrElements.split(" ");
    int[] resultArr = new int[elements.length];
    for (int index = 0; index < elements.length; index++)
      resultArr[index] = Integer.parseInt(elements[index]);
    return resultArr;
  }
}
