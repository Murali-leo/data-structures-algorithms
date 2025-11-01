package com.aspirer.stack.parantheses.medium;

import java.util.Stack;

/**
 * LeetCode Problem: ReversePolishNotation
 * Problem Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
*/
public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            if(s.equals("+")) {
                int add = stack.pop() + stack.pop();
                stack.push(add);
            } else if (s.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if (s.equals("*")) {
                int mul = stack.pop() * stack.pop();
                stack.push(mul);
            } else if (s.equals("/")) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2/val1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
