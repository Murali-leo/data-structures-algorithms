/**
 * LeetCode Problem: MinSubArraySum
 * Problem Link: https://leetcode.com/problems/minimum-size-subarray-sum/
*/
package com.aspirer.slidingwindow;

public class MinSubArraySum {
    
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0, right = 0;
        int sum = 0;

        int minLen = Integer.MAX_VALUE;

        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        MinSubArraySum minSubArraySum = new MinSubArraySum();
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArraySum.minSubArrayLen(7, nums));
    }
}
