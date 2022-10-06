package Recusion.LeetcodeMedium;

import java.util.ArrayList;
import java.util.List;

public class combinationSumIII {
    public static void main(String[] args) {
        combinationSum3(2,18);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(k, n, new ArrayList<>(), result,1,0);
        for(List a: result){
            System.out.println(a);
        }
        return result;
    }

    private static void helper(int k, int target, ArrayList<Integer> list, List<List<Integer>> result, int start,int sum) {
        if(sum > target)
            return;
        if (sum == target){
            if(list.size() == k) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i < 10; i++) {
            list.add(i);
            helper(k,target,list,result,i + 1,sum + i);
            list.remove(list.size()-1);
        }
    }
}
