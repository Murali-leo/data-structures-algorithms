/**
 * LeetCode Problem: PartitionArrayByPivot
 * Problem Link: https://leetcode.com/problems/partition-array-according-to-given-pivot/
 */

package com.aspirer.twopointers.arrays.medium;

public class PartitionArrayByPivot {

    public int[] pivotArray(int[] nums, int pivot) {

        int tracker = 0;
        int[] result = new int[nums.length];

        for(int val : nums) {
            if(val < pivot) {
                result[tracker++] = val;
            }
        }

        for(int val : nums) {
            if(val == pivot) {
                result[tracker++] = val;   
            }
        }

        for(int val : nums) {
            if(val > pivot) {
                result[tracker++] = val;   
            }
        }
        return result;
    }

    /*
     public static int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0, j=n-1, left=0, right=n-1;
        int[] ans=new int[n];
        while(i<n){
            if(nums[i]<pivot){
                ans[left++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[right--]=nums[j];
            }
            i++;
            j--;
        }
        while(left<=right){
            ans[left++]=pivot;
        }
        return ans;
    }
     */
}
