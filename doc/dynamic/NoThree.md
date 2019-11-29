# No Three

## Problem Statement
Given is a sequence of distinct positive numbers, ﬁnd a sub-sequence with the
maximum possible sum, with the restriction that it is not allowed to take three
consecutive elements from the original sequence.

Give an O(n) dynamic programming solution to find the sum of such sub-sequence
(assume input sequence of length n). Provide heart of the solution.

## Example
For input sequence {1, 6, 5, 2, 7, 9, 3, 4}, the sub-sequence with
the maximum possible sum is {6, 5, 7, 9, 4} (here two pairs of consecutive
elements are {6, 5} and {7, 9} but not three consecutive elements).

## Assumption / Constraints

## Input Format
The first line contains n, and it is followed by a line containing n values,
each separated by a white space. Assume that n is less than 1000 and that all
input values fit in a 32 bit integer.

## Output Format
The output contains a single line containing a single number, the maximum sum
of elements of the sequence satisfying the constraint that no three consecutive
elements are included. Include the new-line character in your output line.

## Sample Input
```
5
3 4 5 1 2
```
## Sample Output
```
11
```

## Heart of the Solution
