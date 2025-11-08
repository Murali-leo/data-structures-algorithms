package com.aspirer.recursionandbacktracking.hard;
/**
 * LeetCode Problem: Permutations
 * Problem Link: https://leetcode.com/problems/permutations/
*/
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getPermute(nums, 0, result, nums.length);
        return result;
    }

    public void getPermute(int[] nums, int index, List<List<Integer>> result, int n) {

        if(index == n) {
            List<Integer> temp = new ArrayList<>();
            for(int num : nums) {
                temp.add(num);
            }
            result.add(new ArrayList<>(temp));
            // result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }

        for(int i = index; i < n; i++) {
            swap(nums, index, i);
            getPermute(nums, index+1, result, n);
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
