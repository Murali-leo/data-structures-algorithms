package src.main.java.com.aspirer.stack.parantheses.easy;
/**
 * LeetCode Problem: RemoveOuterMostParantheses
 * Problem Link: https://leetcode.com/problems/remove-outermost-parentheses/
*/

public class RemoveOuterMostParantheses {
    public String removeOuterParentheses(String s) {
       StringBuilder str = new StringBuilder();
       int count = 0;
       for(char ch : s.toCharArray()) {
            if(ch == '(') {
                count++;
                if (count > 1) {
                    str.append('(');
                }
                
            } else {
                count--;
                if(count > 0) {
                    str.append(')');
                }
            }
       }
       return str.toString();
    }
}
