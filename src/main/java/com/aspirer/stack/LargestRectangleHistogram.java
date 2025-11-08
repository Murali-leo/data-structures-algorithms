package com.aspirer.stack;
/**
 * LeetCode Problem: LargestRectangleHistogram
 * Problem Link: https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] right = new int[len];
        int[] left = new int[len];
        Stack<Integer> stack = new Stack<>();

        for(int i = len - 1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            right[i] = stack.isEmpty() ? len : stack.peek();
            stack.push(i);
        }

        while(!stack.isEmpty()){
            stack.pop();
        }

        for(int i = 0; i < len; i++) {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i < len; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        LargestRectangleHistogram lrh = new LargestRectangleHistogram();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(lrh.largestRectangleArea(heights)); // Output: 10
    }


}
