package Sorting;
// https://leetcode.com/problems/height-checker/submissions/
import java.util.Arrays;

public class CheckingsortedwithduplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(checker(nums));

    }
    public static int checker(int[] nums) {
        int[] expected = new int[nums.length];
        int count = 0;
        expected = nums.clone();
        Arrays.sort(expected);
        for(int i = 0; i < expected.length; i++){
            if(nums[i] != expected[i])
                count++;
        }
        return count;
    }
}
