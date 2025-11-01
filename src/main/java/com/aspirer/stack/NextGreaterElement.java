package com.aspirer.stack;
/**
 * LeetCode Problem: NextGreaterElement
 * Problem Link: https://leetcode.com/problems/next-greater-element-ii/
 */
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] numsLinear = new int[len*2];

        for(int i = 0; i < len*2; i++) {
            numsLinear[i] = nums[i%len];
        }

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[len];

        for(int i = 2*len - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= numsLinear[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                result[i%len] = -1;
            } else {
                result[i%len] = stack.peek();
            }
            stack.push(numsLinear[i]);
        }
        return result;
    }
}
