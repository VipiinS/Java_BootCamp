package Strings;

import java.util.List;

public class longestStringPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        for(int i = 0; i < strs[0].length(); i++) // i is used to point to the letters
        {
            char c = strs[0].charAt(i); // the fist words first letter is chosen
            for (int j = 1; j < strs.length; j ++) {
                if(i == strs[j].length() || c != strs[j].charAt(i))
                    return strs[0].substring(0,i);
            }
        }return strs[0];
    }
}
