package Recusion.LeetcodeMedium;

public class KthSymbol {
    public static void main(String[] args) {
        //System.out.println(kthGrammar(2,2));
        //System.out.println(recrusion(3,2));
    }
    public static int kthGrammar(int n, int k) {
        //time limit exceeded
        /*
        String result =  helper ("0",n);
        return (result.charAt(k-1) - '0');
         */
        return -1;
    }
    private static String helper(String s, int n) {
        if(n == 1)
            return s;
        return helper(s + invert(s),n-1);
    }

    private static String invert(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            ans.append((str.charAt(i) - '0') ^ 1);
        }
        return ans.toString();
    }
}
