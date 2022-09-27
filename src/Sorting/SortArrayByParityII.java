package Sorting;
// https://leetcode.com/problems/sort-array-by-parity-ii/
import java.util.Arrays;
//Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
//Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//Return any answer array that satisfies this condition.
//Input: nums = [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.


// USED TWO POINTER METHOD - a new array is created to store the answers
 //even and odd pointer, when the element is odd,it is added tp odd index of the array(not swapped with existing array).
// and same is done for even elements
public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5,7};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(ans(nums)));
    }

    public static int[] ans(int[] nums) {
        int[] ans = new int[nums.length];
        int evenpointer = 0;
        int oddpointer = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 != 0){
                ans[oddpointer] = nums[i];
                oddpointer += 2;
            }
            else{
                ans[evenpointer] = nums[i];
                evenpointer += 2;
            }
        }
        return ans;
    }
}
