package Sorting;

import java.util.Arrays;
// https://leetcode.com/problems/contains-duplicate/
/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



        Example 1:

        Input: nums = [1,2,3,1]
        Output: true*/
public class containsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
            if(nums[i] == nums[i+1])
                System.out.println("contains duplicates"); // use a return statement instead
    } // put an return statement here to return false
}
