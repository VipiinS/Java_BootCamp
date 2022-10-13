package Recusion.LeetcodeMedium;
/*
526. Beautiful Arrangement
Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:
perm[i] is divisible by i.
i is divisible by perm[i].
Given an integer n, return the number of the beautiful arrangements that you can construct.
Input: n = 2
Output: 2
Explanation:
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1

        Recursion tree:
                    [1,2,3]
                /      |     \
              [1]     [2]    [3]
            /   |   \
       X[1,1] [1,2]   [1,3]
             /  |   \
      X[1,2,1] X[1,2,2] [1,2,3]
      recursion tree goes by this,but in the for loop check for the given condition and proceed with the tree
 */
public class beautifulArrangement {
    public static void main(String[] args) {
        countArrangement(4);
    }
    public static void countArrangement(int n) {
        /*
        TLE:
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            str.append(i);
        }
        System.out.println(Permutations("",str.toString()));
        */
        boolean[] visited = new boolean[n+1];
        System.out.println(helper(n,1,visited));
    }

    private static int helper(int n, int pos, boolean[] visited) {
        if(pos > n)
            return 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(!visited[i] && (pos % i == 0 || i % pos == 0)) { // checking whether the number is repeating and check the given condition
                visited[i] = true; // setting the current number as true to avoid repeating int the next recursion call
                count += helper(n,pos+1,visited);
                visited[i] = false;// backtracking
            }
        }
        return count;
    }


    // TLE
    private static int Permutations(String p, String up){
        if(up.isEmpty()){
            return count(p);
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String e = p.substring(i);
            count += Permutations(f+ch+e, up.substring(1));
        }
        return count;
    }
    private static int count(String str) {
        for (int i = 1; i <= str.length(); i++) {
            if((str.charAt(i-1) - '0') % i != 0 && i % (str.charAt(i-1) - '0') != 0)
                return 0;
        }
        return 1;
    }
}
