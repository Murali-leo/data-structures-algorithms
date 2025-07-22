/**
 * LeetCode Problem: NextPermutation
 * Problem Link: https://leetcode.com/problems/next-permutation/
*/

package src.main.java.com.aspirer.twopointers.arrays.medium;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int idx = nums.length - 2;
        while(idx >=0 && nums[idx] >= nums[idx+1]) {
            idx--;
        }

        if(idx >= 0) {
            int j = nums.length - 1;
            while(j >=0 && nums[j] <= nums[idx]) j--;
            swap(nums, idx, j);
        }
        reverse(nums, idx);
    }

    private void swap(int[] nums, int idx, int j) {
       int temp = nums[idx];
       nums[idx] = nums[j];
       nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
