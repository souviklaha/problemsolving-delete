package org.svaarg.problemsolving.array;

// Author : Umang J Gala
// Date   : 13-Feb-2019

/*
Problem Statement
-----------------
Given an array of integers, write a function that reverse all consecutive
positive integers between the negative numbers.

Input Format
------------
The first line contains the value of n, indicating the size of the array. The
second line contains the integers a1, a2, ..., an, separated by a space.

Output Format
-------------
The output contains single line with the elements of the array with consecutive
positive integers reversed, which are separated by space. Include a new line
character in your output line.

Sample Input 1:
11
4 3 8 9 -2 6 10 13 -1 2 3

Sample Output 1:
9 8 3 4 -2 13 10 6 -1 3 2

 */

/**
 * Class ReversePositiveNumbers
 * Reverse all consecutive positive numbers between negative numbers
 *
 * @author Umang J Gala
 */
public class ReversePositiveNumbers {

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
