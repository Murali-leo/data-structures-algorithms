/**
 * LeetCode Problem: RichestCustomerWealth
 * Problem Link: https://leetcode.com/problems/richest-customer-wealth/
*/ 
package com.aspirer.arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int[] customer : accounts) {
            int currentSum = 0;
            for(int money : customer) {
                currentSum += money;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
