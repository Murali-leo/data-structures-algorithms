/**
 * LeetCode Problem: MergeTwoSortedArrays
 * Problem Link: https://leetcode.com/problems/merge-sorted-array/
 */ 
package com.aspirer.arrays;

public class MergeTwoSortedArrays {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else {
                result[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        for(int a = 0; a < m+n; a++) {
            nums1[a] = result[a];
        }
    }

    public void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
