package Strings;
//https://leetcode.com/problems/valid-palindrome/
//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
public class validPalindromeI {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    // lowercase ascii ranges from 97 to 122
    // 0 to 9 ascii is 48 to 57
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        String str = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if((str.charAt(i) >= 97) && (str.charAt(i) <= 122)|| str.charAt(i)>=48 && str.charAt(i)<=57) {
                ans.append(str.charAt(i));
            }
        }
        System.out.println("ans:"+ans);
        StringBuilder rev = new StringBuilder(ans);
        rev.reverse();
        System.out.println("rev:" +rev);
        for (int i = 0; i < rev.length(); i++) {
            if(rev.charAt(i) != ans.charAt(i))
                return false;
        }
        return true;
    }
}
