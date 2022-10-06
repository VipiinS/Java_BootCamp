package Recusion.LeetCodeHard;
import java.util.*;
// have done for all numbers having 3 character numpad;
// do for numpad having 4 characters for 7 and 9 numbers.
public class PhoneCombinations {
    public static void main(String[] args) {
        phoneCombinations("","12");
        System.out.println();
        System.out.println(phoneCombinationsRet("","12"));
        System.out.println(phoneCombinationsCount("","12"));
    }
    public static void phoneCombinations(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + ", ");
            return;
        }
        int digits = up.charAt(0) - '0'; // 0 is added to convert the 12 to digits, 10 to digit firs and 2 to digit next;
        int start = (digits - 1) * 3;
        int end = start + 3;
        for (int i = start; i < end; i++) {
            char ch =(char) ('a' + i);
            phoneCombinations(p + ch, up.substring(1));

        }
    }

    public static List<String> phoneCombinationsRet(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digits = up.charAt(0) - '0'; // 0 is added to convert the 12 to digits, 10 to digit firs and 2 to digit next;
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch =(char) ('a' + i);
            list.addAll(phoneCombinationsRet(p + ch, up.substring(1)));

        }
        return list;
    }
    public static int phoneCombinationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digits = up.charAt(0) - '0'; // 0 is added to convert the 12 to digits, 10 to digit firs and 2 to digit next;
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch =(char) ('a' + i);
            count = count + phoneCombinationsCount(p + ch, up.substring(1));

        }
        return count;
    }
}
