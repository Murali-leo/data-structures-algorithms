/**
 * LeetCode Problem: SumQueryImmutable
 * Problem Link: https://leetcode.com/problems/range-sum-query-2d-immutable/
 */
package com.aspirer.matrix;

public class SumQueryImmutable {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3)); // Output: 8
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2)); // Output: 11
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4)); // Output: 12
    }
}

class NumMatrix {

    int row;
    int col;
    int[][] input;
    public NumMatrix(int[][] matrix) {

        row = matrix.length;
        col = matrix[0].length;
        input = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                input[i][j] = matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = 0;
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                sum += input[i][j];
            }
        }
        return sum;
    }
}
