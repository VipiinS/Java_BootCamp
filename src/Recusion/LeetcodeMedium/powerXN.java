package Recusion.LeetcodeMedium;

public class powerXN {
    public static void main(String[] args) {
        System.out.println(myPow(2,2));
    }
    public static double myPow(double x, int n) {
        //corner conditions to improve optimization
        if(x == 1) return 1;
        if(n == 0) return 1;
        if(x == 0) return 0;
        if(n == 0) return x;
        // for test cases
        if(n==Integer.MIN_VALUE && x>0)
            return 0;
        if(n==Integer.MIN_VALUE && x<0)
            return 1;
        return n >= 0 ? helper(x,n) : 1 / helper (x, n*-1);
    }
    private static double helper(double x,int n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return helper(x * x,n / 2);
        return x * helper(x,n-1);
    }
}
