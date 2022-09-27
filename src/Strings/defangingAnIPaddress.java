package Strings;
//https://leetcode.com/problems/defanging-an-ip-address/
//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
public class defangingAnIPaddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        //ans.append(address.charAt(0));
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                ans.append('[');
                ans.append('.');
                ans.append(']');
                ans.append(address.charAt(++i));
            }
            else
                ans.append(address.charAt(i));
        }
        return ans.toString();
    }
}
