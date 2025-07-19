/**
 * LeetCode Problem: PeakIndexInMountainArray
 * Problem Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

package binarysearch.medium;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length - 2;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
