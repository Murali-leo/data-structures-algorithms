/**
 * LeetCode Problem: MedianFinder
 * Problem Link: https://leetcode.com/problems/find-median-from-data-stream/
*/ 
package com.aspirer.heap;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> lowHeap;
    PriorityQueue<Integer> highHeap;

    public MedianFinder() {
        lowHeap = new PriorityQueue<>((a, b) -> b - a);
        highHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        lowHeap.offer(num);
        highHeap.offer(lowHeap.poll());

        if(lowHeap.size() < highHeap.size()) {
            lowHeap.offer(highHeap.poll());
        }

    }
    
    public double findMedian() {
        if(lowHeap.size() > highHeap.size()){
            return (double) lowHeap.peek();
        }
        return (lowHeap.peek() + highHeap.peek()) / 2.0;
    }
}
