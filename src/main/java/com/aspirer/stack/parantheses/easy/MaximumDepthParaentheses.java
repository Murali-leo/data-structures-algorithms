package com.aspirer.stack.parantheses.easy;
/**
 * LeetCode Problem: MaximumDepthParaentheses
 * Problem Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
*/

public class MaximumDepthParaentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int count = 0;
        for(Character ch : s.toCharArray()) {
            if(ch == '(') {
                count++;
                if(count > maxDepth) {
                    maxDepth = count;
                }
            } else if (ch == ')') {
                count--;
            }
        }
        return maxDepth;
    }
}
