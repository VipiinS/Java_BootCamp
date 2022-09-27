package Strings;
//https://leetcode.com/problems/valid-palindrome-ii/
//680. Valid Palindrome II
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//Input: s = "aba"
//Output: true
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
// binary search like two pointer.
public class validPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }
    public static boolean validPalindrome(String str) {
        int s = 0;
        int e = str.length()-1;
        while(s < e){
            if(str.charAt(s) != str.charAt(e)){ // if the element in the start and end doesn't match
                return check(str,s+1,e) || check(str,s,e-1); // the first letter is removed and sent to a function and checked for palindrom.
            }                                                     // the last letter is removed and sent to function for palindrome check
            else {
                s++; // start and end element match,hence they next is checked
                e--;
            }
        }
        return true;
    }
    public static boolean check(String str,int s,int e){
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            else {
                s++;
                e--;
            }
        }
        return true;
    }
}
