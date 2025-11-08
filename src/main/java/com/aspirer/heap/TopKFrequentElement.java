package com.aspirer.heap;
/**
 * LeetCode Problem: topKFrequent
 * Problem Link: https://leetcode.com/problems/top-k-frequent-elements/
*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.keySet()) {
            heap.offer(i);
        }

        for(int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
