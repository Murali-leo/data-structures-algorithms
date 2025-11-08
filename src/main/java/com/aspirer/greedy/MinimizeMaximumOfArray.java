/**
 * LeetCode Problem: MinimizeMaximumOfArray
 * Problem Link: https://leetcode.com/problems/minimize-maximum-of-array/
 */
package com.aspirer.greedy;

public class MinimizeMaximumOfArray {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int avg = (int)((sum + i) / (i + 1));
            if(avg > result) {
                result = avg;
            }
        }
        return result;
    }
}
