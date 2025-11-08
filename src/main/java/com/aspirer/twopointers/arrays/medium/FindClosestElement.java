/**
 * LeetCode Problem: FindClosestElement
 * Problem Link: https://leetcode.com/problems/find-k-closest-elements/
*/

package com.aspirer.twopointers.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElement {

    public List<Integer> findClosestElementsOptimal(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;

            // Compare distance from x between arr[mid] and arr[mid + k]
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Build the result list
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

        // Use two pointers to find the k closest elements
        while (right - left >= k) {
            if (Math.abs(arr[right] - x) >= Math.abs(arr[left] - x)) {
                right--;
            } else {
                left++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    
}
