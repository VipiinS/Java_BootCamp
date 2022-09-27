package Strings;

public class StringContainSUbstring {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","eet"));
        System.out.println(strStr1("leetcode","eet"));
    }
    public static int strStr(String haystack, String needle) { //built in function
        return haystack.indexOf(needle);
    //return -1;
    }
    public static int strStr1(String haystack,String needle){
        for (int i = 0; i < haystack.length() - needle.length()+1; i++) {
            //checks which index contains the first charcter of needle
            if(haystack.charAt(i) == needle.charAt(0)){
                //if the first character matches, then haystack is searched for a whole needle
                if(haystack.substring(i,i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
