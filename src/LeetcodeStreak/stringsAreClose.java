package LeetcodeStreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class stringsAreClose {

    // Driver program to test above function
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "abb";
        System.out.println(closeStrings(s1,s2));
    }

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
            return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for (char ch: word1.toCharArray()) {
            a[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            b[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if((a[i] >= 1 && b[i] == 0)||(a[i] == 0 && b[i] >= 1))
                return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < 26; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
