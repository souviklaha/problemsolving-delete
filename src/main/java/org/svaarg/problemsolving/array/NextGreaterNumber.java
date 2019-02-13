package org.svaarg.problemsolving.array;

/*
Problem Statement
-----------------
Given a number n, find the smallest number that has same set of digits as n
and is greater than n. If x is the greatest possible number with its set of
digits, then print "NOT POSSIBLE"

Input Format
------------
Input contains only one integer value n

Output Format
-------------
The output contains single line a number, smallest and greater than n with same
set of digits or -1 if no such number possible

Sample Input 1:
218765

Sample Output 1:
251678

Sample Input 2:
4321

Sample Output 2:
-1

 */

import org.svaarg.problemsolving.util.Utility;

import java.util.Arrays;

/**
 * Class NextGreaterNumber
 * Find the smallest number that has same set of digits as given number
 *
 * @author Umang J Gala
 */
public class NextGreaterNumber {
  int findNext(char[] noDigits) {
    int i;

    // I) Start from the right most digit and find the first digit that is
    // smaller than the digit next to it.
    for (i = noDigits.length - 1; i > 0; i--) {
      if (noDigits[i] > noDigits[i - 1])
        break;
    }

    // If no such digit is found, then all digits are in descending order means
    // there cannot be a greater number with same set of digits
    if (i == 0)
      return -1;
    else {
      int x = noDigits[i - 1], min = i;

      // II) Find the smallest digit on right side of (i-1)'th digit that is
      // greater than number[i-1]
      for (int j = i + 1; j < noDigits.length; j++) {
        if (noDigits[j] > x && noDigits[j] < noDigits[min]) {
          min = j;
        }
      }

      // III) Swap the above found smallest digit with number[i-1]
      Utility.swapArrayElements(noDigits, i - 1, min);

      // IV) Sort the digits after (i-1) in ascending order
      Arrays.sort(noDigits, i, noDigits.length);

      return Integer.parseInt(new String(noDigits));
    }
  }
}
