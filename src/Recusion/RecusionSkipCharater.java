package Recusion;

public class RecusionSkipCharater {
    public static void main(String[] args) {
        skip("","abcdadafgh");
    }
    public static void skip(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){ // will skip 'a' character
            skip(p + "",up.substring(1)); // will remove the 0th index in string
        }
        else
            skip(p + ch, up.substring(1));
        //p+ch return a string, any string + character will return a string
    }
}
