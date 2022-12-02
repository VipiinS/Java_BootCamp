package Strings;

public class reverseWordsInString {
    public static void main(String[] args) {
        String str = "   hello world  ";
        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());
        int start = str.length() - 1;
        int end = start;
        StringBuilder ans = new StringBuilder();
        while(end > -1){
            if(str.charAt(end) == ' '){
                ans.append(str.substring(end+1,start + 1));
                ans.append(' ');
                while(end > -1 && str.charAt(end) == ' '){
                    end--;
                }
                start = end;
            }
            end--;
        }
        ans.append(str.substring(end+1,start+1));
        System.out.println(ans.toString());
    }
}
