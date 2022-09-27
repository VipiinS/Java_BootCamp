package Strings;
//https://leetcode.com/problems/reverse-prefix-of-word/
//2000. Reverse Prefix of Word
//Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
//For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
//Return the resulting string.
//Input: word = "abcdefd", ch = "d"
//Output: "dcbaefd"
//Explanation: The first occurrence of "d" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
public class ReversePrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefg",'d'));
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String reversed = reverse(word.substring(0,index+1));
        String ans = reversed + word.substring(index + 1,word.length());
        return ans;
    }
    public static String reverse(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
