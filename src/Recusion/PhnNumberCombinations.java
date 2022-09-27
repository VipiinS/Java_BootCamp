package Recusion;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.ArrayList;
//17. Letter Combinations of a Phone Number ... Medium
//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class PhnNumberCombinations {
    public static void main(String[] args) {
        //letterCombinations("","27");
        System.out.println(letterCombinationsRet(""));
    }
    public static void letterCombinations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        int end = start + 3;
        if(digit >= 7) {// digit = 7 or 8 or 9.
            end++;
        }
        if(digit >=8){
            start++;
            end++;
        }
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            letterCombinations(p + ch,up.substring(1));
        }
    }
    public static ArrayList<String> letterCombinationsRet(String digits){
        if(digits.equals(""))
        {
            return new ArrayList<>();
        }
        return helper("",digits);
    }

    public static ArrayList<String> helper(String p, String up) { // p processed,up unprocessed
        if(up.isEmpty()){ // base condition
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;// if base condition is reached the processed string is sent to the recursion call
        }
        int digit = up.charAt(0) - '0'; //changing String letter to integer letter
        int start = (digit - 2) * 3; // setting the start limit for each integer
        int end = start + 3;
        // for 7 and 9 there are 4 alphabets int he num pad,so the start and end are incremented respectively
        if (digit == 7){
            end = start + 4;
        }
        if(digit == 8){
            start++;
            end = start + 3;
        }
        if(digit == 9){
            start ++;
            end = start + 4;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i); // a + number gives the required alphabet
            ans.addAll(helper(p + ch,up.substring(1))); // recursion call
        }
        return ans;
    }
}
