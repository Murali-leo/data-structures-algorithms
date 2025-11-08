package com.aspirer.recursionandbacktracking.hard;
/**
 * LeetCode Problem: Subsets
 * Problem Link: https://leetcode.com/problems/subsets/
*/
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        getSubsets(nums, arr, 0, result);
        return result;
    }

    public void getSubsets(int[] nums, List<Integer> arr, int index, List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[index]);
        getSubsets(nums, arr, index + 1, result);
        arr.remove(arr.size() - 1);
        getSubsets(nums, arr, index + 1, result);
    }
}
