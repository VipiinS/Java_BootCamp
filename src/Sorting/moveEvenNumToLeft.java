package Sorting;
// https://leetcode.com/problems/sort-array-by-parity/
import java.util.Arrays;
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//Return any array that satisfies this condition.
//Example 1:
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

// USED CYCLE SORT + SELECTION SORT
// and TWO POINTER
//Moved the odd numbers to the last index
public class moveEvenNumToLeft {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        // cycle + selection
        //System.out.println(Arrays.toString(sortArrayByParity(nums)));
        System.out.println(Arrays.toString((twopointer(nums))));
    }

    private static int[] twopointer(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            if(nums[s]%2 ==0)
                s++;
            else {
                swap(nums,s,e);
                e--;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length - 1;
        int last = n;
        int i = 0;
        while(i < n && last >= 0 && i <= last){
            if(nums[i] % 2 != 0){
                swap(nums,i,last);
                last--;
            }
            else
                i++;
        }
        return nums;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
