/**
 * LeetCode Problem: LongestTurbulentSA
 * Problem Link: https://leetcode.com/problems/longest-turbulent-subarray/
*/ 
package com.aspirer.arrays;

public class LongestTurbulentSA {
    public int maxTurbulenceSize(int[] arr) {
        char[] turbulent = new char[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                turbulent[i] = '>';
            } else if (arr[i] < arr[i + 1]) {
                turbulent[i] = '<';
            } else {
                turbulent[i] = '=';
            }
        }

        if(turbulent.length == 0 || turbulent.length == 1 && turbulent[0] == '=') {
            return 1;
        }

        if(turbulent.length == 1) {
            return 2;
        }

        int left = 0;
        int right = 1;
        int maxLen = 1;
        System.out.println(turbulent);
        while(right < turbulent.length) {
            if ((turbulent[left] != turbulent[right] && (right - left) % 2 != 0 && turbulent[right] != '=' && turbulent[left] != '=') || 
            (turbulent[left] == turbulent[right] && (right - left) % 2 == 0) && turbulent[right] != '=' && turbulent[left] != '=') {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                left = right;
            }
            right++;
        }
        return maxLen + 1;
    }

    public int maxTurbulenceSizeOptimal(int[] arr) {
        int up = 1;
        int down = 1;
        int maxLen = 1;

        for(int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]) {
                down = up + 1;
                up = 1;
            } else if (arr[i] < arr[i + 1]) {
                up = down + 1;
                down = 1;
            } else {
                up = down = 1;
            }
            maxLen = Math.max(maxLen, Math.max(up, down));
        }
        return maxLen;
     }

    public static void main(String[] args) {
        LongestTurbulentSA longestTurbulentSA = new LongestTurbulentSA();
        System.out.println(longestTurbulentSA.maxTurbulenceSizeOptimal(new int[]{0,1,1,0,1,0,1,1,0,0})); // 5
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{4,8,12,16})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{100})); // 1
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,9})); // 1
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5,4})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5,4,3})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5,4,3,2})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5,4,3,2,1})); // 2
        System.out.println(longestTurbulentSA.maxTurbulenceSize(new int[]{9,8,7,6,5,4,3,2,1,0})); // 2
    }
}
