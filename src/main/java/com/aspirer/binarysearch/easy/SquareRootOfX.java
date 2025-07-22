/**
 * LeetCode Problem: SquareRootOfX
 * Problem Link: https://leetcode.com/problems/sqrtx/
 */
package src.main.java.com.aspirer.binarysearch.easy;

public class SquareRootOfX {
    public int mySqrt(int x) {
        if(x==0 || x == 1){
            return x;
        }

        int low = 1;
        int high = x >> 1;

        while(low<=high){
            int mid = low + ((high-low) >> 1);
            if(mid <= x / mid){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
