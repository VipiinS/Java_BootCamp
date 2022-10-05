package Recusion.LeetcodeMedium;

import java.util.*;

public class combinationSumII {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        combinationSum2(arr,8);
    }
    public static void combinationSum2(int[] candidates, int target) {
    Set<List<Integer>> result = new HashSet<>(); // Hash set doesn't contain duplicates
    helper(candidates,target, 0, new ArrayList<>(),result);
    for(List<Integer> a : result){
        System.out.println(a);
    }
    }

    private static void helper(int[] candidates, int target, int start, ArrayList<Integer> list,Set<List<Integer>> result) {
        if(target < 0)
            return;
        if(target == 0)
            result.add(new ArrayList<>(list));
        for (int i = start ; i < candidates.length;i++){
            list.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1 , list, result); // same as combinationI but doesn't repeat the same element in the recursive tree
            list.remove(list.size() - 1);
            for(;i<candidates.length-1;i++)
                if(candidates[i] != candidates[i+1])
                    break;
        }
    }
}
