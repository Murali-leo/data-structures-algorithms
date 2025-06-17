/**
 * LeetCode Problem: ScoreOfParantheses
 * Problem Link: https://leetcode.com/problems/score-of-parentheses/
*/

package medium;

import java.util.Stack;

public class ScoreOfParantheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentScore = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(currentScore);
                currentScore = 0;
            } else {
                int lastScore = stack.pop();
                if(currentScore == 0) {
                    currentScore = lastScore + 1;
                } else {
                    currentScore = lastScore + 2*currentScore;
                }
            }
        }
        return currentScore;
    }
}
