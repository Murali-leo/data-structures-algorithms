/**
 * LeetCode Problem: ProductOfArrayExceptItself
 * Problem Link: https://leetcode.com/problems/product-of-array-except-self/
*/
package com.aspirer.arrays;

public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] output = new int[len];
        output[0] = 1;

        for (int i = 1; i < len; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = len - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            output[i] *= suffix;
        }
        return output;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptItself product = new ProductOfArrayExceptItself();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = product.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6
    }
}
