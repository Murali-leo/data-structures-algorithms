package com.aspirer.recursionandbacktracking.easy;

public class SortedArray {
    public boolean isSorted(int[] arr, int n) {
        if(n == 0 || n == 1) {
            return true;
        }

        return arr[n-1] >= arr[n-2] && isSorted(arr, n-1);
    }

    public static void main(String[] args) {
        SortedArray sa = new SortedArray();
        int[] arr = {1,2,3,4,5,6,7,81,9};
        int n = arr.length;
        boolean result = sa.isSorted(arr, n);
        System.out.println("Is the array sorted? " + result);
    }
}
