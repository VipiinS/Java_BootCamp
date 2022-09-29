package Recusion;

import java.util.ArrayList;

public class mazeBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,false},
                {true,false,true},
                {true,true,true},
                {true,false,true}
        };
        allPath("",0,0,board);
        System.out.println(allPathRet("", 0,0, board));
    }
    private static ArrayList<String> allPathRet(String p,int r,int c,boolean[][] maze){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]) {
            return new ArrayList<>();
        }
        maze[r][c] = false;
        ArrayList<String> ans = new ArrayList<>();
        if(r > 0){
            ans.addAll(allPathRet(p + 'U',r - 1, c, maze));
        }
        if (r < maze.length - 1) {
            ans.addAll(allPathRet(p + 'D',r + 1, c, maze));
        }
        if (c < maze[0].length - 1){
            ans.addAll(allPathRet(p+ 'R',r,c + 1,maze));
        }
        if(c > 0){
            ans.addAll(allPathRet(p + 'L',r,c - 1,maze));
        }
        maze[r][c] = true;
        return ans;
    }
    private static void allPath(String p,int r,int c,boolean[][] maze){
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return ;
        }
        maze[r][c] = false;
        if(r > 0){
            allPath(p + 'U',r - 1, c, maze);
        }
        if (r < maze.length - 1) {
            allPath(p + 'D',r + 1, c, maze);
        }
        if (c < maze[0].length - 1){
            allPath(p+ 'R',r,c + 1,maze);
        }
        if(c > 0){
            allPath(p + 'L',r,c - 1,maze);
        }
        maze[r][c] = true;
    }
}
