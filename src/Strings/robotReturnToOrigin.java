package Strings;
//https://leetcode.com/problems/robot-return-to-origin/
//657. Robot Return to Origin//There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
//You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
//Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
//Input: moves = "UD"
//Output: true
//Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
public class robotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }
    public static boolean judgeCircle(String moves) {
        int[] coordinates = {0,0};
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U'){
                coordinates[0] ++;
            } else if (moves.charAt(i) == 'D') {
                coordinates[0]--;
            } else if (moves.charAt(i) == 'L') {
              coordinates[1]--;
            }else coordinates[1]++;
        }
        if(coordinates[0] == 0 && coordinates[1] == 0)
        return true;
        return false;
    }
}
