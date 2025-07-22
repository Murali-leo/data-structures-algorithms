package src.main.java.com.aspirer.twopointers.arrays.easy;
/**
 * LeetCode Problem: TwoSum
 * Problem Link: https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int nums1 = nums[i];
            int nums2 = target - nums1;
            if(map.containsKey(nums2)) {
                result[0] = i;
                result[1] = map.get(nums2);
                return result;
            }
            map.put(nums1, i);
        }
        return result;
    }
}
