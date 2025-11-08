package com.aspirer.recursionandbacktracking.hard;
/**
 * LeetCode Problem: SudokoSolver
 * Problem Link: https://leetcode.com/problems/sudoku-solver/
*/
public class SudokoSolver {
    private boolean helper(char[][] board, int row, int col) {

        if(row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for(char digit = '1'; digit <= '9'; digit++) {
            if(isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if(helper(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char digit) {
        // horizontal check
        for(int i = 0; i <= 8; i++) {
            if(board[row][i] == digit) {
                return false;
            }
        }

        //vertical check
        for(int i = 0; i <= 8; i++) {
            if(board[i][col] == digit) {
                return false;
            }
        }

        //grid chech
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i <= sr + 2; i++) {
            for(int j  = sc; j <= sc + 2; j++) {
                if(board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
