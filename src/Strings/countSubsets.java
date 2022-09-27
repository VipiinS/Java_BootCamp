package Strings;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

//1967. Number of Strings That Appear as Substrings in Word
//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.
//Input: patterns = ["a","abc","bc","d"], word = "abc"
//Output: 3
//- "a" appears as a substring in "abc".
//- "abc" appears as a substring in "abc".
//- "bc" appears as a substring in "abc".
//- "d" does not appear as a substring in "abc".
//3 of the strings in patterns appear as a substring in word.
public class countSubsets {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s:patterns){
            if(word.contains(s)) count++;
        }
        return count;
    }

}
