/**
 * LeetCode Problem: CountNegativeInSortedArray
 * Problem Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
*/ 
package com.aspirer.arrays;

public class CountNegativeInSortedArray {
    public int countNegatives(int[][] grid) {
        int negCount = 0;
        for(int[] rows : grid) {
            for(int j = rows.length - 1; j >= 0; j--) {
                if(rows[j] < 0) {
                    negCount++;
                } else {
                    break;
                }
            }
        }
        return negCount;
    }
}
