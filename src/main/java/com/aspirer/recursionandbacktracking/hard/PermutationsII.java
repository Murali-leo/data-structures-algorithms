package com.aspirer.recursionandbacktracking.hard;
/**
 * LeetCode Problem: PermutationsII
 * Problem Link: https://leetcode.com/problems/permutations-ii/
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        getPermute(nums, 0, result, n);
        return result;
    }

    private void getPermute(int[] nums, int index, List<List<Integer>> result, int n) {
        if(index == n) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        Set<Integer> seen = new HashSet<>();
        for(int i = index; i < n; i++) {
            if(seen.contains(nums[i])) continue;
            seen.add(nums[i]);
            swap(nums, i, index);
            getPermute(nums, index + 1, result, n);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
