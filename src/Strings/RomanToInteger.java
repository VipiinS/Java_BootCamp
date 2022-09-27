package Strings;
//https://leetcode.com/problems/roman-to-integer/
///13. Roman to Integer
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        if(s.length() == 1)
            return getValue(s.charAt(0));
        int ans = 0;
        int a;
        int b;
        for(int i = 0; i < s.length()-1; i++){
            a = getValue(s.charAt(i));
            b = getValue(s.charAt(i+1));
            if(a>=b)
                ans += a;
            else
                ans -= a;
        }
        return ans + getValue(s.charAt(s.length()-1));


    }
    public static int getValue(char ch){
        if(ch == 'I')
            return 1;
        if(ch == 'V')
            return 5;
        if(ch == 'X')
            return 10;
        if(ch == 'L')
            return 50;
        if(ch == 'C')
            return 100;
        if(ch == 'D')
            return 500;
        else
            return 1000; // 'M'
    }
}
