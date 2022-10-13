package Recusion.LeetcodeMedium;

import java.util.Arrays;

public class perfectSquares {
   // public static int count = 0;
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
    public static int numSquares(int n) {
        int[] dp = new int[n+1]; //dynamic programming
        Arrays.fill(dp,-1); // filling all the index with -1
        return f(n,dp);
    }

    private static int f(int n,int[] dp) {
        /*
        if the dp array index contains a value other than -1,
        it means the branch is repeating,instead of calculating again
        the value stores in dp is used
         */
        if(dp[n] != -1)
            return dp[n];
        if(n == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int curr = f(n-i*i,dp) + 1;
            min = Math.min(curr,min);
            dp[n] = min; // if the answer is obtained it is stored in the dp array
        }
        return dp[n] ;
    }

}
/*
                        Recursive tree
                                    f(12)
                            /           |         \
                  1 + f(12-1)       1 + f(12-4)    1 + f(12-9)
                                    /       \
                                1 + f(8-1) 1+f(8-4)
                                            /     \
                                        1+f(4-1)  1+f(4-4)
                                                    |
                                                    0
 */
