package Strings;

public class reverseSentence {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(str);
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i;
        int j = 0;
        for (i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){ // when a  signle word is found,the word is sent to another function to reverse it
                ans.append(reverseSingleWord(s.substring(j,i))); // the reversed string is then appended
                ans.append(" ");// a white space is added 
                j = i + 1; // j = i+1  so that when the next word is found,it'll be from j till i
            }
        }
        ans.append((reverseSingleWord(s.substring(j,i))));

        return ans.toString();
    }
    public static String reverseSingleWord(String s) { //receives a string,reverse it using a string bruilder
        StringBuilder ans = new StringBuilder();
        for (int i = s.length()-1; i >= 0 ; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
