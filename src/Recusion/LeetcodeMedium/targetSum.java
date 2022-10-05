package Recusion.LeetcodeMedium;
//494. Target Sum
//You are given an integer array nums and an integer target.
//You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
//For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
//Return the number of different expressions that you can build, which evaluates to target.
//Input: nums = [1,1,1,1,1], target = 3
//Output: 5
//Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
/*
                                    [1, 1, 1, 1, 1]         Kinda like processed and unprocessed string
                                  p    up /   \  p  up
                     sum = 1     +1 (1,1,1,1)   -1 (1,1,1,1)  sum = -1
                                   /       \
               sum = 2       +1+1 (1,1,1)    +1-1 (1,1,1)   sum = 0
                              /       \
         sum = 3      +1+1+1 (1,1)      +1+1-1 (1,1)  sum = 1
                    /           \
     sum = 4  +1+1+1+1 (1)      +1+1+1-1 (1) sum = 2
               /        \
 sum = 5  +1+1+1+1+1    +1+1+1+1-1  sum = 3
        return 1 if sum = target at the end of recursion call or return 0
 */

public class targetSum {
    private static int countTarget(int[] nums, int target, int p, int sum) {
        if(p == nums.length) {
            return target == sum ? 1 : 0; // if the sum is equal to target,return 1
        }
        // sum is added by the next element in first recursive call and in th next call sum is subtracted by the element to form a recursive tree
        return countTarget(nums,target,p+1,sum + (nums[p])) + countTarget(nums,target,p+1,sum + (- nums[p]));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return countTarget(nums,target,0,0);
    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1};
        System.out.println(findTargetSumWays(arr,3));
    }
}
