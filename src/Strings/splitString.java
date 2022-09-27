package Strings;

public class splitString {
    public static void main(String[] args) {
        String str = "Uo";
        String s = str.toLowerCase();
        int n = s.length();
        String s1 = s.substring(0,n/2);
        String s2 = s.substring(n/2,n);
        int count1 = countVowels(s1);
        int count2 = countVowels(s2);
        System.out.println(count1 == count2);
    }

    private static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' )
                count++;
        }
        return count;
    }

}
