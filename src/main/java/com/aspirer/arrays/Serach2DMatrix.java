/**
 * LeetCode Problem: Serach2DMatrix
 * Problem Link: https://leetcode.com/problems/search-a-2d-matrix/
*/
package com.aspirer.arrays;

public class Serach2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int rowLen = matrix.length;
        int colLen = matrix[i].length;
        int start = 0;
        int end = colLen - 1;
        boolean check = false;

        while (i < rowLen) {
            if (target >= matrix[i][start] && target <= matrix[i][end]) {
                check = true;
                break;
            }
            i++;
        }

        if (check) {
            return binarySearch(matrix[i], target);
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low) + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
}
