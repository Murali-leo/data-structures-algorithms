package com.aspirer.stack.parantheses.medium;
/**
 * LeetCode Problem: DailyTemperatures
 * Problem Link: https://leetcode.com/problems/daily-temperatures/
 */
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int noOfTemp = temperatures.length;
        int[] result = new int[noOfTemp];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < noOfTemp; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                result[prevDay] = i - prevDay;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {34,80,80,80,34,80,80,80,34,34};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        for(int res : result) {
            System.out.print(res + " ");
        }
    }
}
