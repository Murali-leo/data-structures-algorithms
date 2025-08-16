/**
 * LeetCode Problem: TwoSum
 * Problem Link: https://leetcode.com/problems/two-sum
 */ 
package com.aspirer.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;

            if(map.containsKey(num2)) {
                return new int[]{map.get(num2), i};
            } else {
                map.put(num1, i);
            }
        }
        return new int[]{0, 0};
    }
}
