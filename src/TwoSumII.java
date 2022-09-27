import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums={1,3,4,6,8,9};
        int target =13;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            if(numbers[start] + numbers[end] == target)
                return new int[]{start +1, end +1};
            if(numbers[start]+numbers[end] < target)
                start++;
            else
                end--;
        }
        return new int[]{};
    }
}
