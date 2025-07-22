/**
 * LeetCode Problem: MergeStringsAlternatively
 * Problem Link: https://leetcode.com/problems/merge-strings-alternately/
*/
package src.main.java.com.aspirer.twopointers.strings.easy;

public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int word1_pointer = 0;
        int word2_pointer = 0;
        int result = 0;
        StringBuilder sb = new StringBuilder();

        while(word1_pointer < word1.length() && 
              word2_pointer < word2.length()) {
            if ((result & 1) == 0) {
                sb.append(word1.charAt(word1_pointer));
                word1_pointer++;
                result++;
            } else {
                sb.append(word2.charAt(word2_pointer));
                word2_pointer++;
                result++;
            }
        }

        while (word1_pointer < word1.length()) {
            sb.append(word1.charAt(word1_pointer));
            word1_pointer++;
            result++;
        }

        while (word2_pointer < word2.length()) {
            sb.append(word2.charAt(word2_pointer));
            word2_pointer++;
            result++;
        }

        return sb.toString();
    }
}
