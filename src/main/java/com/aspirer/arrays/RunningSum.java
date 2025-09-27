/**
 * LeetCode Problem: RunningSum
 * Problem Link: https://leetcode.com/problems/running-sum-of-1d-array/
 */
package com.aspirer.arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int pointer = 1;
        runningSum[0] = nums[0];
        while(pointer < nums.length) {
            runningSum[pointer] = runningSum[pointer - 1] + nums[pointer];
            pointer++;
        }
        return runningSum;
    }
}
