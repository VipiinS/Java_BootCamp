package Sorting;
//https://leetcode.com/problems/third-maximum-number/

import java.util.Arrays;

/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
 */
public class thirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        Arrays.sort(nums);
        System.out.println(thirdMaxnumber(nums));
    }

    public static int thirdMaxnumber(int[] nums){
        int n = nums.length -1;
        if( n < 2) return nums[n];
        int i,count = 0;
        for (i = n - 1; i >= 0; i--){
            if (nums[i] != nums[i+1])
                count++;
            if(count == 2) return nums[i];
        }
        return nums[n];
    }
}
