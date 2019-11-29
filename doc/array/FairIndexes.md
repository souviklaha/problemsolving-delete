# Fair Indexes

## Problem Statement
Given two arrays A and B consisting of N integers each.

Index K is named fair if the four sums (A[0] +...+ A[K-1]), (A[k] +...+ A[N-1]),
(B[0] +...+ B[K-1]) and (B[k] +...+ B[N-1]) are all equal. In other words, K is
the index where the two arrays, A and B, can be split (into two non-empty arrays
each) in such a way that the sums of the resulting arrays elements are equal.

Write an efficient algorithm that returns the number of fair indexes.

## Example
Given, A = [4,-1,0,3] and B = [-2,5,0,3]

No of fair indices = 2

The fair indexes are 2 and 3. In both cases, the sum of elements of the
sub-arrays are equal to 3

## Assumption / Constraints
  * N is an integer within the range [2 - 100,000]
  * Each element in the arrays A and B is an integer with the range 
    [-1,000,000,000 - 1,000,000,000]

## Input Format
The first line contains the value of N, indicating the size of the arrays. 
The second and third line contains the integer elements of array A = [a1, a2, ..., aN]
and array B = [b1, b2, ..., bN] respectively separated by a space.

## Output Format
A single line contains a integer, number of fair indexes.

## Sample Input
```
4
4 -1 0 3
-2 5 0 3
```
## Sample Output
```
2
```