package Sorting;
//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/

import java.util.Arrays;

//1460. Make Two Arrays Equal by Reversing Sub-arrays
//You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.
//Return true if you can make arr equal to target or false otherwise.
//Input: target = [1,2,3,4], arr = [2,4,1,3]
//Output: true
public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] target = {2,4,1,3};
        System.out.println(canBeEqual(arr,target));

    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != target[i])
                return false;
        }
        return true;
    }
}
