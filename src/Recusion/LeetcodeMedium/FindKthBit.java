package Recusion.LeetcodeMedium;

public class FindKthBit {
    public static void main(String[] args) {
        System.out.println(findKthBit(4,11));
    }
    public static char findKthBit(int n, int k) {
    String result = helper("0",n);
    return result.charAt(k-1);
    }

    private static String helper(String s, int n) {
        if(n == 0)
            return s;
        return helper(s+1+reverse(invert(s)),n-1);
    }
    private static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    private static String invert(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1')
                ans.append('0');
            else ans.append('1');
        }
        return ans.toString();
    }
}
