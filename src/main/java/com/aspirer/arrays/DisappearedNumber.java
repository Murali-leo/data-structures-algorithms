/**
 * LeetCode Problem: DisappearedNumber
 * Problem Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */ 
package com.aspirer.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> inputNums = new HashSet<>();
        for(int num : nums) {
            inputNums.add(num);
        }
        List<Integer> disappearedNumbers = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) {
            if(!inputNums.contains(i)) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }

    public List<Integer> findDisappearedNumbersUsingArray(int[] nums) {
        int[] count = new int[nums.length + 1];

        for(int num : nums) {
            count[num]++;
        }
        List<Integer> disappearedNumbers = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) {
            if(count[i] == 0) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
}
