package com.aspirer.stack.design;

import java.util.Stack;

/**
 * LeetCode Problem: MinimumStack
 * Problem Link: https://leetcode.com/problems/min-stack/
*/
public class MinimumStack {
    Stack<Integer> inputStack;
    Stack<Integer> minStack;
    public MinimumStack() {
        inputStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        }
        inputStack.push(val);
    }
    
    public void pop() {
        if(inputStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        inputStack.pop();
    }
    
    public int top() {
        return inputStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
