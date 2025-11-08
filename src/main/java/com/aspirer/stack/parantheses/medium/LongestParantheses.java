package com.aspirer.stack.parantheses.medium;

import java.util.Stack;

/**
 * LeetCode Problem: LongestParantheses
 * Problem Link: https://leetcode.com/problems/longest-valid-parentheses/
 */
public class LongestParantheses {
    public int longestValidParentheses(String s) {
        
        int maxLength = 0;
        int lastValidindex = -1;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if(currentChar == '(') {
                stack.push(i);
            } else {
                if(stack.isEmpty()) {
                    lastValidindex = i;
                } else {
                    stack.pop();
                    if(stack.isEmpty()) {
                        maxLength = Math.max(maxLength, i - lastValidindex);
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestParantheses lp = new LongestParantheses();
        String s = "(()";
        int result = lp.longestValidParentheses(s);
        System.out.println("Longest valid parentheses length: " + result); // Output: 6
    }
}
