/**
 * LeetCode Problem: ContainsDuplicate
 * Problem Link: https://leetcode.com/problems/contains-duplicate/
 */ 
package com.aspirer.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    /**
     * This method checks if the input array contains any duplicate elements.
     * It uses a HashMap to track the elements that have been seen.
     *
     * @param nums an array of integers
     * @return true if there are duplicates, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
}
