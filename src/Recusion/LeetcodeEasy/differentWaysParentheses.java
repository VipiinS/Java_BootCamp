package Recusion.LeetcodeEasy;
import java.util.ArrayList;
import java.util.List;
//241. Different Ways to Add Parentheses
//Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
//The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 104.
//Input: expression = "2-1-1"
//Output: [0,2]
//Explanation:
//((2-1)-1) = 0
//(2-(1-1)) = 2

/* Recursive tree
          (ans:2)              (ans:0)
        2 - 1 - 1           2 - 1 - 1
         / \                     /   \
        2 -  (1 - 1)          (2-1) - (1)
              / \              / \
             1   1            2   1
     */
public class differentWaysParentheses {
    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2-1-1"));
    }
    public static List<Integer> diffWaysToCompute(String expression) {
    ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if( ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left  = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right  = diffWaysToCompute(expression.substring(i+1));
                for(int l : left)
                    for(int r : right){
                        if( ch == '+')
                            result.add(l + r);
                        else if( ch == '-')
                            result.add(l - r);
                        else
                            result.add(l * r);
                    }
            }

        }
    if(result.size() == 0)
        result.add(Integer.valueOf(expression));
    return result;
    }
}
