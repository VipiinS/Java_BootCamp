package Recusion;

public class RecursionReversingNumber {
    public static void main(String[] args) {
        System.out.println(rev(12345));
    }

    private static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1; //no. of digits in number
        return helper(n,digits); // helper function will multiply the remainder with 10 power digits for each recursion
    }

    private static int helper(int n, int digits) {
        if ( n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * ((int)Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }/*
    the remainder is multiplied with 10pow3 for 3 digit number
    and the last digit of number is removed by /10
    and digits is reduced by 1.
    */
}
