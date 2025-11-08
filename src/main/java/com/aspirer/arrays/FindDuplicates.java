/**
 * LeetCode Problem: FindDuplicates
 * Problem Link: https://leetcode.com/problems/find-the-duplicate-number/
*/
package com.aspirer.arrays;

public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
