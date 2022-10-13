package Recusion;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        //List<String> ans = permutationsList("","abc");
        //System.out.println(ans);
        Permutations1("","abc");
        System.out.println(Permutations1("","abc"));
    }

    public static List<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    private static void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String e = p.substring(i);
            Permutations(f+ch+e, up.substring(1));
        }
    }

    // for practice
    public static ArrayList<String> Permutations1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String last = p.substring(i);
            ans.addAll(Permutations1(first+ch+last,up.substring(1)));
        }
        return ans;
    }
}
