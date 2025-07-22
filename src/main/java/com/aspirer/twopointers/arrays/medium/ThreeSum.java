/**
 * LeetCode Problem: ThreeSum
 * Problem Link: https://leetcode.com/problems/3sum/
 */

package src.main.java.com.aspirer.twopointers.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;

        for(int i = 0; i < len-2; i++) {
            int start = i + 1;
            int end = len - 1;

            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
