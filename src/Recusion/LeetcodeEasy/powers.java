package Recusion.LeetcodeEasy;

public class powers {
    public static void main(String[] args) {
        //System.out.println(powerOf2(16));
        //System.out.println(powerOf3(27));
        System.out.println(powerOf4(17));
    }

    private static boolean powerOf2(int n) {
            if(n == 1)
                return true;
            if(n % 2 != 0) // to check whether the number is odd,as odd numbers are not power of 2
                return false;
            if(n == 0) // if the given number is 0
                return false;
            return powerOf2(n / 2); // recursive call
    }
    private static boolean powerOf3(int n){
        if(n == 0) // test case
            return false;
        if(n == 1) // base condition
            return true;
        if(n % 3 != 0) // only multiples of 3 can be powers of 3
            return false;
        return powerOf3(n/3); // recursive call,dividing the number by three
    }
    private static boolean powerOf4(int n){
        if(n == 0) // test case
            return false;
        if(n == 1) // base condition
            return true;
        if(n % 4 != 0) // only multiples of 4 can be powers of 4
            return false;
        return powerOf4(n/4); // recursive call,dividing the number by three
    }
}
