package Strings;

public class removeDuplicates {
    public static void main(String[] args) {
        //System.out.println(removeDup("aaleex"));
        System.out.println(isLongPressedName("alex","aaleexa"));

    }
    public static boolean isLongPressedName(String name, String typed) {
        //return(removeDup(name).equals(removeDup(typed))); // did not pass all test cases
        if(name.charAt(0) != typed.charAt(0)) // if first character doesn't match then return false;
            return false;
        int i = 1;
        int j = 1;
        while(i < name.length() && j < typed.length()){ // the second character is checked
            if(name.charAt(i) == typed.charAt(j)){ // if both are same,they are incremented
                i++;
                j++;
            }
            else{
                if(typed.charAt(j) != typed.charAt(j-1)) // is i and j index element does not match,it is checked whether previous element is same in 'typed'(long pressed)
                    return false;
                else j++; // if they are same then j++
            }
        }
        //case 1: all elements are transversed
        if(i == name.length() && j == typed.length())
            return true;
        //case 2: j is complete but i is not complete,return falee.
        else if( i != name.length() && j == typed.length())
            return false;
        //case 3: i is complete,j is incomplete
        else{
            while(j< typed.length()){ // then j is transversed to check all the letters are same.
                if(typed.charAt(j) == typed.charAt(j-1))
                    j++; //if anyone character after i completion changes then its a wrong string so return false.
                else
                    return false;
            }
        }
        return true;
    }
    public static String removeDup1(String str){ // not passing all test cases
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                ans.append(str.charAt(i-1));
                i++;
            }
            else{
                ans.append(str.charAt(i-1));
            }
        }
        if(str.charAt(str.length()-1) != str.charAt(str.length()-2)){
            ans.append(str.charAt(str.length()-1));
        }
        return ans.toString();
    }
}
