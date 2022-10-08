package Recusion.LeetcodeMedium;

public class countGoodNumbers {
    //public long mod = 1000000007;
    public static void main(String[] args) {
        System.out.println(countGoodnumbers(50 ));
    }
    public static int countGoodnumbers(long n) {
        long odd =  n / 2;
        long even = (n + 1) / 2;
        //return (int) ((pow(5,even) * pow(4,odd))%1000000007);
        return (int) ((myPow(5.0000,even) * myPow(4.0000,odd)) % 1000000007);
    }
    public static double myPow(double x, long n) {
        //corner conditions to improve optimization
        if(x == 1) return 1;
        if(n == 0) return 1;
        if(x == 0) return 0;
        // for test cases
        if(n==Integer.MIN_VALUE && x>0)
            return 0;
        if(n==Integer.MIN_VALUE && x<0)
            return 1;
        return n >= 0 ? helper(x,n) : 1 / helper (x, n*-1);
    }
    private static double helper(double x,long n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return helper(x * x,n / 2);
        return x * helper(x,n-1);
    }
}
