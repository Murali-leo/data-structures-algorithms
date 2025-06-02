/**
 * LeetCode Problem: SortColors
 * Problem Link: https://leetcode.com/problems/sort-colors/
 */
package twopointers.arrays.medium;

public class SortColors {
    public void sortColors(int[] nums){

        int zerosCount = 0;
        int onesCount = 0;
        int twosCount = 0;

        for(int val : nums) {
            if(val == 0) {
                zerosCount++;
            } else if (val == 1) {
                onesCount++;
            } else {
                twosCount++;
            }
        }
        int idx = 0;
        while(zerosCount != 0) {
            nums[idx] = 0;
            idx++;
            zerosCount--;
        }

        while(onesCount != 0) {
            nums[idx] = 1;
            idx++;
            onesCount--;
        }

        while(twosCount != 0) {
            nums[idx] = 2;
            idx++;
            twosCount--;
        }
    }
    /*
     * Dutch National Flag problem
     */
    /*
     public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high) {
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
     */
}
