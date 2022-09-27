package Strings;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

//1309. Decrypt String from Alphabet to Integer Mapping
//You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
//Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//Return the string formed after mapping.
//The test cases are generated so that a unique mapping will always exist.
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
public class DecryptString {
    public static void main(String[] args) {
        String str = "10#11#12";
        System.out.println(freqAlphabets1(str));
    }
    public static String freqAlphabets(String s){
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >=0 ; i--) { // transversing from the last index
            if(s.charAt(i) == '#'){ // if the element in index is '#', the two elements it is converted to int and added to 'a' create the character need
                int num = Integer.parseInt(s.substring(i-2,i)) - 1;
                char ansCh = (char)('a' + num);
                ans.append(ansCh); // they are then appended
                i -= 2; // skipping the processed numbers
            }
            else {
                int num = s.charAt(i) - '0'; // if there's no '#' then only the i is converted to num
                char ansCh = (char)('a' + (num - 1));
                ans.append(ansCh);
            }
        }
        StringBuilder fin = new StringBuilder();  // as we traversed from the last, the string we got will  be in reversed order,hence a new string is made and returned
        for (int i = ans.length() - 1; i >= 0 ; i--) {
            fin.append(ans.charAt(i));
        }
        return fin.toString();
    }


    public static String freqAlphabets1(String s) { //
        String[] str = s.split("#");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            char ch = (char)('a' + num -1);
            ans.append(ch);
        }
        return ans.toString();
    }
}
