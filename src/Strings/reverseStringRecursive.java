package Strings;

public class reverseStringRecursive {
    public static void main(String[] args) {
        String str = "word";

        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if(str.isEmpty())
            return "";
        char ch = str.charAt(0);
//        StringBuilder res = new StringBuilder();
        return reverse(str.substring(1)) + ch;
    }
}
