package Sorting;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

import java.util.Arrays;

//1464. Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
//Input: nums = [3,4,5,2]
//Output: 12
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
public class MaximumProductOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length -1;
        int ans = (nums[n] -1) * (nums[n-1] -1);
        return ans;
    }
}
