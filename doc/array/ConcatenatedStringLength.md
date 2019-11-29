# Maximum Length of a Concatenated String with Unique Characters

## Problem Statement

Given an array of strings arr. 
String s is a concatenation of a sub-sequence of arr which have unique characters.

Return the maximum possible length of s.

## Example
Input: arr = ["un","iq","ue"]

Output: 4

Explanation: All possible concatenations are "","un","iq","ue","uniq" and "ique".
Maximum length is 4.

## Assumption / Constraints
  * 1 <= arr.length <= 16
  * 1 <= arr[i].length <= 26 
  * arr[i] contains only lower case English letters.

## Input Format
The first line contains the value of N, indicating the size of the array. 
The second line contains the string elements of array arr = [a1, a2, ..., aN] 
separated by a space.

## Output Format
A single line contains a integer, maximum length of unique character string.

## Sample Input
```
3
un iq ue
```
## Sample Output
```
4
```
