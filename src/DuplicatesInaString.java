import java.util.Arrays;

public class DuplicatesInaString {
    public static void main(String[] args) {
        String str = "alphaadida";
        int n = str.length();
        int count = 0;
        char[] ch = str.toCharArray();
        char last = 'l';
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < n; i++){
            if(ch[i] != last){
                for ( int j = i + 1; j < n; j++){
                    if(ch[i] == ch[j]){
                        last = ch[i];
                        count++;
                    }
                }
            }
        }
        System.out.println((n - 2 - count));
    }
}
