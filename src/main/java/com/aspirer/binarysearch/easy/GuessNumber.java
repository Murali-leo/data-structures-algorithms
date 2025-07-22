/**
 * LeetCode Problem: GuessNumber
 * Problem Link: https://leetcode.com/problems/guess-number-higher-or-lower/
 */

package src.main.java.com.aspirer.binarysearch.easy;

public class GuessNumber {
    static int pick = 0;
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(guess(mid) == -1) {
                high = mid - 1;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

    private int guess(int mid) {
        if(pick < mid) {
            return 1;
        } else if(pick > mid) {
            return -1;
        }
        return 0;
    }
}
