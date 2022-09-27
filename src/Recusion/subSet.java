package Recusion;

import java.util.ArrayList;

public class subSet {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subset1("",str));
        subset1("",str);
    }
    public static ArrayList <String> subSetReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList <String> left = subSetReturn( p + ch, up.substring(1));
        ArrayList <String> right = subSetReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }
// for practicing
    public static ArrayList<String> subset1(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset1(p+ch,up.substring(1));
        ArrayList<String> right =  subset1(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
