package com.aspirer.heap;
/**
 * LeetCode Problem: FindKPairSums
 * Problem Link: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
*/
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for(int i = 0; i < Math.min(nums1.length, k); i++) {
            int sum = nums1[i] + nums2[0];
            minHeap.offer(new int[]{sum, i , 0});
        }

        while(k-- > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int i = current[1];
            int j = current[2];

            result.add(new ArrayList<>(List.of(nums1[i], nums2[j])));
            if(j + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[i] + nums2[j + 1], i , j + 1});
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindKPairSums findKPairSums = new FindKPairSums();
        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};
        int k = 2;
        List<List<Integer>> result = findKPairSums.kSmallestPairs(nums1, nums2, k);
        System.out.println("Result: " + result);
    }
}
