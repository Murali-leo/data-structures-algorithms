/**
 * LeetCode Problem: FourSum
 * Problem Link: https://leetcode.com/problems/4sum/
 */

package src.main.java.com.aspirer.twopointers.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;

        for(int i = 0; i < len-3; i++) {
            for( int j = i+1; j < len - 2; j++) {
                int start = j + 1;
                int end = len - 1;
                
                while(start < end) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];
                    if(sum < target) {
                        start++;
                    } else if(sum > target) {
                        end--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
