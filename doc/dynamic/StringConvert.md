# String Convert

## Problem Statement
Given two strings, X = x1x2...xm and Y = y1y2...yn. The task is to convert
string X into Y at minimal cost. The options to convert string are:
* at a cost of 3, delete a single character from X.
* at a cost of 4, insert a single character at any position in X.
* at a cost of 5, replace two consecutive characters in X with some
  other character.

Give a O(m.n) dynamic programming solution to this problem. Also provide the
heart of the solution.

## Example
Given X = "beard" and Y = "bored", X can be converted into Y using the
following sequence. At a cost of 5, X can be converted to X1 = "bord" by
replacing "ea" with "o". Then, at cost of 4, X1 can be converted into Y =
"bored" by inserting an "e", for a total cost of 9. On the other hand, to
convert X = "aboard" to Y = "beard", the minimum cost is 10, by deleting an
"a", inserting an "e" and deleting an "o", since two non-consecutive
characters in X cannot be replaced in one step.

## Assumption / Constraints

## Input Format
The first line contains the first string X. The second line contains second
string Y. The new-line character is not part of either string.

## Output Format
A single line containing the integer-valued minimal cost to convert string X
into string Y. Include the new-line character in your output line.

## Sample Input
```
beard
bored
```
## Sample Output
```
9
```

## Heart of the Solution
