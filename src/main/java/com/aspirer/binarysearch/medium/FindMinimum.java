/**
 * LeetCode Problem: FindMinimum
 * Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

package src.main.java.com.aspirer.binarysearch.medium;

public class FindMinimum {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;


        while(low <= high) {

            if(nums[low] <= nums[high]) {
                return Math.min(min, nums[low]);
            }
            
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]) {
                min = Math.min(nums[low], nums[mid]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }

        }
        return min;
    }
}
