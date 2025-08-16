/**
 * LeetCode Problem: MissingNumber
 * Problem Link: https://leetcode.com/problems/missing-number
 */ 
package com.aspirer.arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for(int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1; // This line should never be reached if input is valid
    }

    public int missingNumberOptimal(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
