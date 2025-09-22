/**
 * LeetCode Problem: FindGCD
 * Problem Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
*/ 
package com.aspirer.arrays;

public class FindGCD {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
