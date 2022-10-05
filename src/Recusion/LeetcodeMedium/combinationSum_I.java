package Recusion.LeetcodeMedium;

import java.util.ArrayList;
import java.util.List;

public class combinationSum_I {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        combinationSum(arr,7);
/*
    RECURSIVE TREE
                                            [ 2, 3 , 6 , 7 ]
                                                /           \
                          target - 2          [2]             [3]
                                           /        \
                   (target-2) -2      [2,2]           [2,3]
                                    /      \            /   \
          ((target-2) -2) -2     [2,2,2]   [2,2,3]   [2,3,3] [2,3,6]
                                  /  \         |
                             [2,2,2,2]         target = 0, add to result
                              target<0,return
 */
    }
    private static void combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumBackTrack(candidates,target,0,new ArrayList<>(),result);
        for(List<Integer> ans : result){
            System.out.println(ans);
        }
    }

    private static void combinationSumBackTrack(int[] candidates, int target, int start, List<Integer> list,List<List<Integer>> result) {
        if(target == 0)
            result.add(new ArrayList<>(list));
        if(target < 0)
            return;
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            combinationSumBackTrack(candidates,target - candidates[i],i, list,result);
            list.remove(list.size() - 1); // As a helper variable 'result' is used, backtracking approach is followed
        }
    }
}
