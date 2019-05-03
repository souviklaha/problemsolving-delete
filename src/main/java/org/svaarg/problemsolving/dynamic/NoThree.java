package org.svaarg.problemsolving.dynamic;

/*
Problem Statement
-----------------
Given is a sequence of distinct positive numbers, ﬁnd a sub-sequence with the
maximum possible sum, with the restriction that it is not allowed to take three
consecutive elements from the original sequence.

For example, for input sequence {1, 6, 5, 2, 7, 9, 3, 4}, the sub-sequence with
the maximum possible sum is {6, 5, 7, 9, 4} (here two pairs of consecutive
elements are {6, 5} and {7, 9} but not three consecutive elements).

Give an O(n) dynamic programming solution to find the sum of such sub-sequence
(assume input sequence of length n). Provide heart of the solution.

Input Format
------------
The first line contains n, and it is followed by a line containing n values,
each separated by a white space. Assume that n is less than 1000 and that all
input values fit in a 32 bit integer.

Output Format
-------------
The output contains a single line containing a single number, the maximum sum
of elements of the sequence satisfying the constraint that no three consecutive
elements are included. Include the new-line character in your output line.

Sample Input 1:
5
3 4 5 1 2

Sample Output 1:
11

 */

import org.svaarg.problemsolving.util.Utility;

/**
 * Class: NoThree
 * <p>
 * To find a sub-sequence with the maximum possible sum, with the restriction
 * that we are not allowed to take three consecutive elements from the
 * original sequence.
 *
 * @author Umang J Gala
 */
class NoThree {

  /**
   * Find a maximum possible sum of subsequence, with the restriction
   * that we are not allowed to take three consecutive elements from
   * input sequence
   *
   * @param inputSequence elements in input sequence
   * @return int          maximum sum of subsequence
   */
  int maximumSumWithNoThreeConsecutiveElement(int[] inputSequence) {
    int[] solution = new int[inputSequence.length + 1];
    solution[0] = 0;

    // For each element in input sequence.
    for (int length = 1; length <= inputSequence.length; length++) {
      // First element.
      if (length == 1) {
        solution[length] = inputSequence[length - 1];
        continue;
      }
      // Second element.
      if (length == 2) {
        solution[length] = solution[length - 1] +
                inputSequence[length - 1];
        continue;
      }
      // Rest all elements (ie. except first and second).
      int one = solution[length - 3] + inputSequence[length - 1] +
              inputSequence[length - 2];

      int two = solution[length - 2] + inputSequence[length - 1];
      int three = solution[length - 1];
      solution[length] = Utility.maximum(one, two, three);
    }
    // printSolution(solution);
    return solution[inputSequence.length];
  }
}