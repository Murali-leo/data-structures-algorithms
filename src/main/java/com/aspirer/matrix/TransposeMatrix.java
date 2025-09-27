/**
 * LeetCode Problem: TransposeMatrix
 * Problem Link: https://leetcode.com/problems/transpose-matrix/
 */
package com.aspirer.matrix;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] transposeMatrix = new int[col][row];

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }
}
