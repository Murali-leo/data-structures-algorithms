package com.aspirer.stack.parantheses.easy;

/**
 * LeetCode Problem: ValidParantheses
 * Problem Link: https://leetcode.com/problems/valid-parentheses/
*/

import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            } else if (ch == '[') {
                st.push(']');
            } else if (ch == '{') {
                st.push('}');
            } else if (st.empty() || ch != st.pop()) {
                return false;
            }
        }
        return st.empty();
    }
}
