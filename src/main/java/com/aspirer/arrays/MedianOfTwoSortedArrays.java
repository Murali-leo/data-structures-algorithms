/**
 * LeetCode Problem: MedianOfTwoSortedArrays
 * Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
*/ 
package com.aspirer.arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] sorted = new int[len1 + len2];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < len1 && j < len2) {
            if(nums1[i] < nums2[j]) {
                sorted[k++] = nums1[i++];
            } else {
                sorted[k++] = nums2[j++];
            }
        }

        while(i < len1) {
            sorted[k++] = nums1[i++];
        }

        while(j < len2) {
            sorted[k++] = nums2[j++];
        }
        double result = 0;
        int total = (len1 + len2);

        if(total % 2 == 1) {
            result = sorted[total/2];
            return result;
        }
        result = (double)(sorted[total/2] + sorted[total/2 - 1])/2;
        return result;
    }
}
