public class UniqueElementInArray {
    public static void main(String[] args) {
    int[] ar = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(ar));
    }

    /*
           a ^ 1 = !a
           a ^ a = 0
           a ^ 0 = a
     */

    private static int ans(int[] ar) {
        int unique = 0;
        for(int n : ar) {
            unique ^= n;
        }
        return unique;
    }
}

/*
   To get nth bit of a bit number use a mask
   mask is 1
   1 << (n-1) & 'given number' gives the nth bit off the number
 */
