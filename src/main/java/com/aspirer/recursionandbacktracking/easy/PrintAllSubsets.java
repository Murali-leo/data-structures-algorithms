package com.aspirer.recursionandbacktracking.easy;
/**
 * LeetCode Problem: subsets
 * Problem Link: https://leetcode.com/problems/subsets/
*/
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    public void printSubsets(int[] arr, List<Integer> ans, int index) {
        if(index == arr.length) {
            for(int num : ans) {
                System.out.print(num + " " );
            }
            System.out.println();
            return;
        }

        // Include the current element
        ans.add(arr[index]);
        printSubsets(arr, ans, index+1);
        // Exclude the current element
        ans.remove(ans.size() - 1);
        printSubsets(arr, ans, index+1);
    }

    public static void main(String[] args) {
        PrintAllSubsets ps = new PrintAllSubsets();
        int[] arr = {1, 2, 3};
        List<Integer> ans = new ArrayList<>();
        ps.printSubsets(arr, ans, 0);
    }
}
