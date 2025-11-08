/**
 * LeetCode Problem: ContainerWithMostWater
 * Problem Link: https://leetcode.com/problems/container-with-most-water/
*/ 
package com.aspirer.arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxContainer = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int width = j - i;
            int high = Math.min(height[i], height[j]);
            int currentContainer = width * high;
            maxContainer = Math.max(maxContainer, currentContainer);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxContainer;
    }
}
