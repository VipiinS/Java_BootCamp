package Strings;
//https://leetcode.com/problems/sorting-the-sentence/

import java.lang.reflect.Array;

//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
public class StringSorting {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
        String[] str = s.split(" ");
        System.out.println(String.join("",str));

    }

    public static String sortSentence(String s) {
        String[] str = s.split(" "); // an new string array is created where "  " is present in the string s
        String[] strNew = new String[str.length]; // new string array to store the ans
        for(String s1 : str){
            String ans = s1.substring(0,s1.length()-1); // the numbers are removed and the word is stored in ans.
            int n = Integer.parseInt(s1.substring(s1.length() - 1));// finding the number at the end of the word
            strNew[n-1] = ans; // the word is placed in its correct index
        }
        return String.join(" ",strNew); // the string array is joined and returned
    }
}
