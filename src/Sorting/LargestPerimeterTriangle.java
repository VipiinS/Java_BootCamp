package Sorting;
// https://leetcode.com/problems/largest-perimeter-triangle/

//Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
//Input: nums = [2,1,2]
//Output: 5
import java.util.Arrays;

//KINDA LIKE A POINTER
// after sorting
// we compare the last element(largest) with previous 2 elements,if it satisfies the condition,then return
//else we compare second largest with its previous 2 elements
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {3,6,2,3};
        Arrays.sort(nums);
        System.out.println(largestPerimeter(nums));

    }
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i+1] > A[i+2])
                return A[i] + A[i+1] + A[i+2];
        return 0;
    }
}
