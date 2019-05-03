package org.svaarg.problemsolving.dynamic;

/*
Problem Statement
-----------------
Given two strings, X = x1x2...xm and Y = y1y2...yn. The task is to convert
string X into Y at minimal cost. The options to convert string are:
    -   at a cost of 3, delete a single character from X.
    -   at a cost of 4, insert a single character at any position in X.
    -   at a cost of 5, replace two consecutive characters in X with some
        other character.
Give a O(m.n) dynamic programming solution to this problem. Also provide the
heart of the solution.

For example,
given X = "beard" and Y = "bored", X can be converted into Y using the
following sequence. At a cost of 5, X can be converted to X1 = "bord" by
replacing "ea" with "o". Then, at cost of 4, X1 can be converted into Y =
"bored" by inserting an "e", for a total cost of 9. On the other hand, to
convert X = "aboard" to Y = "beard", the minimum cost is 10, by deleting an
"a", inserting an "e" and deleting an "o", since two non-consecutive
characters in X cannot be replaced in one step.

Input Format
------------
The first line contains the first string X. The second line contains second
string Y. The new-line character is not part of either string.

Output Format
-------------
A single line containing the integer-valued minimal cost to convert string X
into string Y. Include the new-line character in your output line.

Sample Input 1:
beard
bored

Sample Output 1:
9

 */

import org.svaarg.problemsolving.util.Utility;

/**
 * Class: StringConvert
 *
 * @author Umang J Gala
 */
class StringConvert {
  /**
   * Converts string X into string Y at minimal cost.
   *
   * @param toConvert string X to be converted
   * @param toMatch   string Y to match with
   * @return minimum conversion cost
   */
  int convertString(String toConvert, String toMatch) {
    int[][] solution = new int[toConvert.length() + 1][toMatch.length() + 1];
    int removeCost = 3;
    int insertCost = 4;
    int replaceCost = 5;

    for (int lengthY = 0; lengthY <= toMatch.length(); lengthY++) {
      for (int lengthX = 0; lengthX <= toConvert.length(); lengthX++) {
        if (lengthY == 0) {
          solution[lengthX][0] = lengthX * removeCost;
          continue;
        }
        if (lengthX == 0) {
          solution[0][lengthY] = lengthY * insertCost;
          continue;
        }
        if (toConvert.charAt(lengthX - 1) == toMatch.charAt(lengthY - 1)) {
          solution[lengthX][lengthY] = solution[lengthX - 1][lengthY - 1];
          continue;
        }
        int ifRemoved = solution[lengthX - 1][lengthY] + removeCost;
        int ifInserted = solution[lengthX][lengthY - 1] + insertCost;
        int ifReplaced = Integer.MAX_VALUE;
        if (lengthX > 1) {
          ifReplaced = solution[lengthX - 2][lengthY - 1] + replaceCost;
        }
        solution[lengthX][lengthY] =
                Utility.minimum(ifRemoved, ifInserted, ifReplaced);
      }
    }
    return solution[toConvert.length()][toMatch.length()];
  }
}
