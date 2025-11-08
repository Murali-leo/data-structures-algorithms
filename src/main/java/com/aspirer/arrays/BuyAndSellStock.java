/**
 * LeetCode Problem: BuyAndSellStock
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/ 
package com.aspirer.arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            int sellPrice = prices[i];
            int currentProfit = sellPrice - buyPrice;
            if(currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
