package com.aspirer.recursionandbacktracking.easy;

public class BinarySearch {
    public int binarySerach(int[] arr, int target, int start, int end) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                return binarySerach(arr, target, start, end - 1);
            } else {
                return binarySerach(arr, target, mid + 1, end);
            }
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int result = bs.binarySerach(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }
}
