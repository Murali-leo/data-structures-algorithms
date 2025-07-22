/**
 * LeetCode Problem: FindFirstAndLastOccurence
 * Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

package src.main.java.com.aspirer.binarysearch.medium;

public class FindFirstAndLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        if(first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastOccurence(nums, target);
        return new int[]{first, last};
    }

    public int firstOccurence(int[] nums, int target) {
        int first = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else { 
                end = mid - 1;
            }
        }
        return first;
    }

    public int lastOccurence(int[] nums, int target) {
        int last = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else { 
                end = mid - 1;
            }
        }
        return last;
    }
}
