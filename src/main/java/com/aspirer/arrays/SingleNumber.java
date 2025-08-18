/**
 * LeetCode Problem: SingleNumber
 * Problem Link: https://leetcode.com/problems/single-number/
 */ 
package com.aspirer.arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for(int i = 1; i < nums.length; i++) {
            singleNumber ^= nums[i] ;
        }
        return singleNumber;
    }
}
