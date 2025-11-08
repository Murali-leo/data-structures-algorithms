package com.aspirer.stack;
/**
 * LeetCode Problem: BaseBallGame
 * Problem Link: https://leetcode.com/problems/baseball-game/
 */
import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String op : operations) {
            if(op.equals("+")) {
                int val1 = stack.pop();
                int val2 = stack.peek();
                int res = val1 + val2;
                sum += res;
                stack.push(val1);
                stack.push(res);
            } else if (op.equals("C")) {
                int remove = stack.pop();
                sum -= remove;
            } else if (op.equals("D")) {
                int dob = stack.peek() * 2;
                sum += dob;
                stack.push(dob);
            } else {
                stack.push(Integer.parseInt(op));
                sum += Integer.parseInt(op);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BaseBallGame baseBallGame = new BaseBallGame();
        String[] operations = {"5","2","+"};
        int result = baseBallGame.calPoints(operations);
        System.out.println("Result: " + result);
    }
}
