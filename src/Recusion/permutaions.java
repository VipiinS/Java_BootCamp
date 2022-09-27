package Recusion;

import java.util.ArrayList;
import java.util.List;

public class permutaions {
    public static void main(String[] args) {
        //List<String> ans = permutaionsList("","abc");
        //System.out.println(ans);
        Permutaions1("","abc");
        System.out.println(Permutaions1("","abc"));
    }

    public static List<String> permutaionsList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutaionsList(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    public static void Permutaions(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String e = p.substring(i,p.length());
            Permutaions(f+ch+e, up.substring(1));
        }
    }

    // for practice
    public static ArrayList<String> Permutaions1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            ans.addAll(Permutaions1(first+ch+last,up.substring(1)));
        }
        return ans;
    }
}
