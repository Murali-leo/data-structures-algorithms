/**
 * LeetCode Problem: MaximumSubArray
 * Problem Link: https://leetcode.com/problems/maximum-subarray/
*/ 
package com.aspirer.arrays;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i : nums) {
            currentSum += i;
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
