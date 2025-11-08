/**
 * LeetCode Problem: MajorityElement
 * Problem Link: https://leetcode.com/problems/majority-element/
 */ 
package com.aspirer.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i : nums) {
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
            if (frequency.get(i) > len / 2) {
                return i; // Return the majority element as soon as we find it
            }
        }
        return -1; // This line should never be reached if the input guarantees a majority element
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
    
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement.majorityElement(nums2)); // Output: 2
    }
}
