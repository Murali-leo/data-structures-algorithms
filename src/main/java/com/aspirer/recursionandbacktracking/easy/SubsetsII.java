package com.aspirer.recursionandbacktracking.easy;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        // Implementation for Subsets II problem will go here
        SubsetsII subsetsII = new SubsetsII();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = new ArrayList<>();
        subsetsII.backtrack(nums, new ArrayList<>(), 0, result);
        System.out.println(result);
    }


    public void backtrack(int[] nums, List<Integer> ans, int index, List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        // Include the current element
        ans.add(nums[index]);
        backtrack(nums, ans, index + 1, result);
        // Exclude the current element
        ans.remove(ans.size() - 1);
        int idx = index + 1;
        // Skip duplicates
        while(idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }
        backtrack(nums, ans, idx, result);
    }
}
