/**
 * LeetCode Problem: KDiffPairs
 * Problem Link: https://leetcode.com/problems/k-diff-pairs-in-an-array/
 */
package com.aspirer.twopointers.arrays.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) == k) {
                    List<Integer> pair = List.of(nums[i], nums[j]);
                    if (!result.contains(pair) && !result.contains(List.of(nums[j], nums[i]))) {
                        result.add(pair);
                    }
                }
            }
        }
        System.out.println(result);
        return result.size();
    }

    public int findPairsOptimal(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(k == 0) {
                if (map.get(key) > 1) {
                    count++;
                }
            } else {
                if (map.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        KDiffPairs kDiffPairs = new KDiffPairs();
        int[] nums = { 1, 2, 4, 4, 3, 3, 0, 9, 2, 3 };
        int k = 3;
        System.out.println(kDiffPairs.findPairs(nums, k));
    }
}
