package LeetcodeStreak;

import java.util.Arrays;
import java.util.Stack;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }
    private static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(stack.empty()){
                    stack.push(count);
                } else if (stack.peek() != count) {
                    stack.push(count);
                }
                else
                    return false;
                count = 1;
            }
        }
        return true;
    }
}
