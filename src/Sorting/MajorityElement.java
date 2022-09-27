package Sorting;
// https://leetcode.com/problems/majority-element/
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than n / 2 times. You may assume that the majority element always exists in the array.

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,1,2,2,2,2,2,2,2,2};
        Arrays.sort(nums);
        int mid = nums.length / 2;
        System.out.println(nums[mid]);
        // after sorting the majority element would be at the center for sure.

    }
}
