/**
 * LeetCode Problem: ContainerWithMostWater
 * Problem Link: https://leetcode.com/problems/container-with-most-water/
*/

package twopointers.arrays.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;

        while(left < right) {
           int tempArea = (right-left) * Math.min(height[left], height[right]);
           if(tempArea > area) {
                area = tempArea;
           }
           if(height[left] < height[right]) {
                left++;
           } else {
                right--;
           }
        }
        return area;
    }
}
