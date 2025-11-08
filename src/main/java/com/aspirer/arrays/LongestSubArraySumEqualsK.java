package com.aspirer.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumEqualsK {
    public int longestSubArraySumEqualsK(int[] arr, int k) {
        int len = arr.length;
        int prefixSum = 0;
        int resultMax = 0;

        Map<Integer, Integer> prefixSumIndexMap = new HashMap<>();

        for(int i = 0; i < len; i++) {
            prefixSum += arr[i];
            int val = prefixSum - k;

            if(prefixSumIndexMap.containsKey(val)) {
                resultMax = Math.max(resultMax, i - prefixSumIndexMap.get(val));
            }
            prefixSumIndexMap.putIfAbsent(prefixSum, i);
        }
        return resultMax;
    }

    public static void main(String[] args) {
        LongestSubArraySumEqualsK longestSubArraySumEqualsK = new LongestSubArraySumEqualsK();
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 1;
        int result = longestSubArraySumEqualsK.longestSubArraySumEqualsK(arr, k);
        System.out.println("Length of the longest sub-array: " + result);
    }
}
