/**
 * LeetCode Problem: ThreeSumClosest
 * Problem Link: https://leetcode.com/problems/3sum-closest/
 */

package twopointers.arrays.medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int result = nums[0] + nums[1] + nums[len - 1];
        Arrays.sort(nums);

        for(int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > target) {
                    right--;
                } else {
                    left++;
                }

                if(Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
