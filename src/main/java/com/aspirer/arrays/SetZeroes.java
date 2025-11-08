/**
 * LeetCode Problem: SetZeroes
 * Problem Link: https://leetcode.com/problems/set-matrix-zeroes/
*/
package com.aspirer.arrays;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        boolean[] rowZeros = new boolean[rowLen];
        boolean[] colZeros = new boolean[colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    rowZeros[i] = true;
                    colZeros[j] = true;
                }
            }
        }

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (rowZeros[i] || colZeros[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroesOptimal(int[][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < colLen; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 0; i < rowLen; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowZero) {
            for (int i = 0; i < colLen; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColZero) {
            for(int i = 0; i < rowLen; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
