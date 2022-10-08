package Recusion.LeetcodeMedium;

public class wordSearch {

    public static void main(String[] args) {
        char[][] board ={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist(board,"BEC"));
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && helper(board, word, i, j,0,visited))
                    return true;
            }
        }
        return false;
    }

    private static boolean helper(char[][] board, String word, int row, int col,int index,boolean[][] visited) {
        if(index == word.length())
            return true;
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col])
            return false;
        if(board[row][col] != word.charAt(index)) // if the letter in the index is not equal to the letter in the board,return false, so that ,next index position wll be checked
            return false;
        visited[row][col] = true;
        if(     helper(board, word, row + 1, col, index+1,visited)||
                helper(board, word, row, col + 1, index+1,visited) ||
                helper(board, word, row - 1, col, index+1,visited) ||
                helper(board, word, row, col - 1, index+1,visited))
            return true; // this true will be returned to the previous method
        visited[row][col] = false;
        return false;
    }

}
