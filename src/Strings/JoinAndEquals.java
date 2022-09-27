package Strings;

public class JoinAndEquals {
    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(w1,w2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);

    }
}
