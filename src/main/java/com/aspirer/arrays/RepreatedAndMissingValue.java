/**
 * LeetCode Problem: RepreatedAndMissingValue
 * Problem Link: https://leetcode.com/problems/find-missing-and-repeated-values/
 */ 

package com.aspirer.arrays;

public class RepreatedAndMissingValue {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int[] count = new int[len*len + 1];
        count[0] = 1;

        for(int[] i : grid) {
            for (int j : i) {
                count[j]++;
            }
        }
        int missedValue = 0;
        int repeatedValue = 0;
        for(int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                missedValue = i;
            }
            if(count[i] == 2) {
                repeatedValue = i;
            }
        }
        return new int[]{repeatedValue, missedValue};
    }
}
