package Recusion.LeetcodeEasy;
//https://leetcode.com/problems/reverse-string/description/
//344. Reverse String
//Write a function that reverses a string. The input    string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};
        char[] ans = new char[s.length];
        System.out.println(reverseStringHelper(s,ans,s.length-1,0));
        reverseStringVoid(s2,0);
        System.out.println(s2);
    }
    private static void reverseStringVoid(char[] s,int i){
        if(s.length/2 == i)
            return;
        char temp = s[i];
        s[i] = s[s.length - 1 - i];
        s[s.length-1-i] = temp;
        reverseStringVoid(s, ++i);
    }

    private static char[] reverseStringHelper(char[] s,char[] ans,int length,int i) {
        if(length < 0){
            return ans;
        }
        ans[i++] = s[length--];
        return reverseStringHelper(s,ans,length,i);
    }

}
