/* Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".*/

class Solution {
  public String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}