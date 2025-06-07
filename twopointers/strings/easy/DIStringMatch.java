/**
 * LeetCode Problem: DIStringMatch
 * Problem Link: https://leetcode.com/problems/di-string-match/
*/

package twopointers.strings.easy;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] result = new int[len+1];
        int low = 0;
        int high = len;

        for(int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[len] = high;
        return result;
    }
}
