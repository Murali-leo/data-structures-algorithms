/**
 * LeetCode Problem: LargestMerge
 * Problem Link: https://leetcode.com/problems/largest-merge-of-two-strings/
*/

package twopointers.strings.medium;

public class LargestMerge {
    
    public static String largestMerge(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();

        while (i < n && j < m) {
            if (word1.substring(i).compareTo(word2.substring(j)) > 0) {
                result.append(word1.charAt(i++));
            } else {
                result.append(word2.charAt(j++));
            }
        }

        result.append(word1.substring(i));
        result.append(word2.substring(j));
        return result.toString();
    }
}
