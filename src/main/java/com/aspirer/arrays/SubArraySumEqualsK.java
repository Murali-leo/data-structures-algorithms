/**
 * LeetCode Problem: SubArraySumEqualsK
 * Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/
*/
package com.aspirer.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] prefixSum = new int[len];

        prefixSum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        int subArrayCount = 0;
        for (int j = 0; j < len; j++) {
            if (prefixSum[j] == k) {
                subArrayCount++;
            }

            int value = prefixSum[j] - k;
            if (frequency.containsKey(value)) {
                subArrayCount += frequency.get(value);
            }
            frequency.put(prefixSum[j], frequency.getOrDefault(prefixSum[j], 0) + 1);
        }
        return subArrayCount;
    }

    public int subarraySumOptimal(int[] nums, int k) {
        int len = nums.length;
        int currentSum = 0;
        int subArrayCount = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1); // To handle the case when currentSum equals k
        for (int j = 0; j < len; j++) {
            currentSum += nums[j];
            int value = currentSum - k;
            if (frequency.containsKey(value)) {
                subArrayCount += frequency.get(value);
            }
            frequency.put(currentSum, frequency.getOrDefault(currentSum, 0) + 1);
        }
        return subArrayCount;
    }
}
