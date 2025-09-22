/**
 * LeetCode Problem: MaxSumCircularSubArray
 * Problem Link: https://leetcode.com/problems/maximum-sum-circular-subarray/
*/ 
package com.aspirer.arrays;

public class MaxSumCircularSubArray {
    public int maxSubarraySumCircular(int[] nums) {

        int currentMax = 0;
        int currentMin = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i : nums) {

            currentMax += i;
            maxSum = Math.max(maxSum, currentMax);
            if(currentMax < 0) {
                currentMax = 0;
            }

            currentMin += i;
            minSum = Math.min(minSum, currentMin);
            if(currentMin > 0) {
                currentMin = 0;
            }

            totalSum += i;
        }

        if(maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
