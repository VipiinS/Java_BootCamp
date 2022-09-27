package Sorting;

import java.util.Arrays;
// https://leetcode.com/problems/maximum-product-of-three-numbers/

//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//Example 1:
//Input: nums = [1,2,3]
//Output: 6

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        Arrays.sort(nums);
        int n = nums.length - 1;
        int ans = nums[n] * nums[n-1] * nums[n-2];
        int ans2 = nums[0] * nums[1] * nums[n];
        if(ans > ans2)
            System.out.println(ans);
        else
            System.out.println(ans2);
    }
}
