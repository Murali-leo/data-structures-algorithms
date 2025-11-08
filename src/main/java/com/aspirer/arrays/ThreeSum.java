/**
 * LeetCode Problem: ThreeSum
 * Problem Link: https://leetcode.com/problems/3sum/
*/ 
package com.aspirer.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> uniqueTriplets = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    uniqueTriplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }

            }
        }
        return uniqueTriplets;
    }
}
