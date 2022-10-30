package Drives;

import java.util.Arrays;
import java.util.Scanner;

public class TCS1 {
    public static void main(String[] args) {
        int[] arr = {9,8,1,2,7,6,5,4,0,3};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        answer2(a,arr);
    }

    // will pass all test cases
    private static void answer2(int a, int[] arr) {
        int max = Integer.MIN_VALUE;
        String str = String.valueOf(a);
        int digits = (int) (Math.log10(a) + 1);
        for (int i = 0; i < digits; i++) {
            char[] charArray = str.toCharArray();
            int num = arr[Integer.parseInt(String.valueOf(str.charAt(i)))];
            char ch = (char)(num + '0');
            charArray[i] = ch;
            int n = Integer.parseInt(String.valueOf(charArray));
            max = Math.max(max,n);
        }
        System.out.println(Math.max(max, a));
    }


    // Will not pass all test cases
    private static void answer(int a, int[] arr) {
        int max = Integer.MIN_VALUE;
        String str = String.valueOf(a);
        int digits = (int) (Math.log10(a) + 1);
        for (int i = 0; i < digits; i++) {
            int num = arr[Integer.parseInt(String.valueOf(str.charAt(i)))];
          char ch = (char)(num + '0');
          char ch1 = str.charAt(i);
          String replaced = str.replace(ch1,ch);
          int n = Integer.parseInt(replaced);
          max = Math.max(max,n);

        }
        System.out.println(max);

    }

}
