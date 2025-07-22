/**
 * LeetCode Problem: ValidPalindrome
 * Problem Link: https://leetcode.com/problems/valid-palindrome/
 */

package src.main.java.com.aspirer.twopointers.strings.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String modifiedString = s.replaceAll("[^a-zA-Z0-9]", "");
        String lower = modifiedString.toLowerCase();
        int start = 0;
        int end = lower.length()-1;
        while(start < end) {
            if(lower.charAt(start) != lower.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
