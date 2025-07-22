/**
 * LeetCode Problem: Lexicographically
 * Problem Link: https://leetcode.com/problems/lexicographically-smallest-palindrome/
 */

package src.main.java.com.aspirer.twopointers.strings.easy;

public class Lexicographically {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                char smaller = (char) Math.min(ch[left], ch[right]);
                ch[left] = smaller;
                ch[right] = smaller;
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}
