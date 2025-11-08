/**
 * LeetCode Problem: FourSum
 * Problem Link: https://leetcode.com/problems/4sum/
*/ 
package com.aspirer.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> uniqueQuadruplets = new ArrayList<>();
        int len = nums.length;
        if (len < 4) {
            return uniqueQuadruplets; // Not enough elements for a quadruplet
        }
        for(int i = 0; i < len - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int  j = i + 1; j < len - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = len - 1;
                while(k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        uniqueQuadruplets.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) {
                            k++;
                        }
                    }
                }
            }
        }
        return uniqueQuadruplets;
    }
}
