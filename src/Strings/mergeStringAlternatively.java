package Strings;
//https://leetcode.com/problems/merge-strings-alternately/
//1768. Merge Strings Alternately
//Easy
//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//Return the merged string.
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
public class mergeStringAlternatively {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcdef","hijklm"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i < word1.length() && i < word2.length()){
            ans.append(word1.charAt(i)); // added alternatively
            ans.append(word2.charAt(i));
            i++;
        }
        while(i < word1.length()){ //case 1 : if word 1 is bigger than word2
            ans.append(word1.charAt(i));
            i++;
        }
        while(i < word2.length()){ // case 2: if word 2 is bigger than word1
            ans.append(word2.charAt(i));
            i++;
        }
        return ans.toString();
    }
}

