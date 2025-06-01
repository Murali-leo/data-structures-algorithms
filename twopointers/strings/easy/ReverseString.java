/**
 * LeetCode Problem: ReverseString
 * Problem Link: https://leetcode.com/problems/reverse-string/
 *
 * Solution by: Murali Reddy
 * Date: 2025-06-01
 */

package twopointers.strings.easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right) {
            char ch = s[left];
            s[left++] = s[right];
            s[right--] = ch;
        }
    }
}