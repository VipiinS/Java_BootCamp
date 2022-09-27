package Strings;
//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//Given the string command, return the Goal Parser's interpretation of command.
//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".
public class goalParser {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans.append('o');
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                ans.append("al");
                i += 3;
            }
            else ans.append('G');
        }
        return ans.toString();
    }

}
