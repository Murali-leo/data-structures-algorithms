/**
 * LeetCode Problem: SortColors
 * Problem Link: https://leetcode.com/problems/sort-colors/
*/ 
package com.aspirer.arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int onesCount = 0;
        int twosCount = 0;
        for(int i : nums) {
            if(i == 1) {
                onesCount++;
            }
            if(i == 2) {
                twosCount++;
            }
        }
        int len = nums.length;
        int zerosCount = len - onesCount - twosCount;
        int k = 0;
        while(k < zerosCount) {
            nums[k] = 0;
            k++;
        }

        while(k < zerosCount + onesCount) {
            nums[k] = 1;
            k++;
        }
        
        while(k < len) {
            nums[k] = 2;
            k++;
        }
    }
}
