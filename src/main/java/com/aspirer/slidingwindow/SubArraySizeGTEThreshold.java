/**
 * LeetCode Problem: SubArraySizeGTEThreshold
 * Problem Link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
*/
package com.aspirer.slidingwindow;

public class SubArraySizeGTEThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = k - 1;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        while(right < arr.length) {
            if(sum / k >= threshold) count++;
            sum -= arr[left];
            left++;
            right++;
            if(right < arr.length) {
                sum += arr[right];
            }
        }
        
        return count;
    }
}
