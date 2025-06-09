/**
 * LeetCode Problem: MinimumRemoveParanthesesValid
 * Problem Link: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
*/

package medium;

public class MinimumRemoveParanthesesValid {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                if (open == 0)
                    continue;
                open--;
            }
            sb.append(ch);
        }
        StringBuilder result = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0)
                continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }
}
