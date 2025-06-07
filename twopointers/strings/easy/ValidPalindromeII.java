/**
 * LeetCode Problem: ValidPalindromeII
 * Problem Link: https://leetcode.com/problems/valid-palindrome-ii/
 */

package twopointers.strings.easy;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return helperMethod(s, start + 1, end) || helperMethod(s, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean helperMethod(String s, int left, int right) {
        int start = left;
        int end = right;

        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
