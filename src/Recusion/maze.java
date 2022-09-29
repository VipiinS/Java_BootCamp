package Recusion;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println("count:" + count(3,3));
        path("",3,3);
        System.out.println("return path: " + pathRet("",3,3));
        System.out.println("diagonal return:" + pathDiaRet("",3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println("obstacle:" + pathDiaObstacleRet("",0,0,board));
    }
    private static int count(int r,int c){
        if(r == 1 || c ==1){
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r,c-1);
        int count = left + right;
        return count;
    }
    private static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + "V", r-1, c);
        }
        if(c > 1){
            path(p + "H", r, c-1);
        }
    }
    private static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(pathRet(p + "V",r-1,c));
        }
        if(c>1){
            ans.addAll(pathRet(p + "H",r,c-1));
        }
        return ans;
    }
    private static ArrayList<String> pathDiaRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1)
            ans.addAll(pathDiaRet(p + "D",r-1,c-1));
        if(r > 1){
            ans.addAll(pathDiaRet(p + "V",r-1,c));
        }
        if(c>1){
            ans.addAll(pathDiaRet(p + "H",r,c-1));
        }
        return ans;
    }
    private static ArrayList<String> pathDiaObstacleRet(String p, int r, int c, boolean[][] board) {
        if (r == board.length-1 && c == board[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!board[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r < board.length - 1 && c < board[0].length - 1)
            ans.addAll(pathDiaObstacleRet(p + "D",r+1,c+1,board));
        if(r < board.length - 1){
            ans.addAll(pathDiaObstacleRet(p + "V",r+1,c,board));
        }
        if(c < board[0].length - 1){
            ans.addAll(pathDiaObstacleRet(p + "H",r,c+1,board));
        }
        return ans;
    }
}
