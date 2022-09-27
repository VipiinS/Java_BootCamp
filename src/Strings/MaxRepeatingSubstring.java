package Strings;
//https://leetcode.com/problems/maximum-repeating-substring/
//1668. Maximum Repeating Substring
//Easy
//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.
//Input: sequence = "ababc", word = "ab"
//Output: 2
//Explanation: "abab" is a substring in "ababc".
//Input: sequence = "ababc", word = "ba"
//Output: 1
//Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
public class MaxRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababcd","ab"));
    }
    public static int maxRepeating(String sequence, String word) {
        if(!sequence.contains(word))// case 1: word is not present in the sequence
            return 0;
        int count = 0;
        String str = word;
        while(sequence.contains(str)){ // case 2: sequence contains thwe word
            str += word; // therefore another copy of thw word is made into str,and if the sequence contains thsi also ,then the count will be 2
            count++;
        }
        return count;
    }
}
