/**
 * LeetCode Problem: TrappingRainWater
 * Problem Link: https://leetcode.com/problems/trapping-rain-water/
*/

package com.aspirer.twopointers.arrays.medium;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lMax = 0;
        int rMax = 0;
        int storedWater = 0;

        while(left < right) {
            
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);

            if(lMax <= rMax) {
                storedWater += lMax - height[left];
                left++;
            } else {
                storedWater += rMax - height[right];
                right--;
            }
        }
        return storedWater;
    }
}
