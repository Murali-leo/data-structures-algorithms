/**
 * LeetCode Problem: InsertInterval 
 * Problem Link: https://leetcode.com/problems/insert-interval/
*/
package com.aspirer.stack.parantheses.medium;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int intervalsLength = intervals.length;
        int[][] result = new int[intervalsLength + 1][2];
        int i = 0;
        int j = 0;

        while(i < intervalsLength && intervals[i][1] < newInterval[0]) {
            result[j++] = intervals[i++];
        }

        while(i < intervalsLength && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i++][1], newInterval[1]);
        }

        result[j++] = newInterval;
        while(i < intervalsLength) {
            result[j++] = intervals[i++];
        }
        return java.util.Arrays.copyOf(result, j);
    }
    
}
