package Recusion;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        System.out.println(solve(board));

    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i = 0 ; i < n ; i++){ // for finding the empty cell to put some number in
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft)
                break;
        }
        if(emptyLeft){
            return true; // no empty is found that means the sudoku is now solved
        }
        // empty cell is spotted,number from 1 to 9 is placed and checked and then backtracked
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)) {
                    System.out.println();
                    display(board);
                    return true;
                }
                else
                    board[row][col] = 0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int row,int col, int num){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num)
                return false;

            for (int[] nums : board) {
            // check if the number is in the col
                if (nums[col] == num){
                    return false;
                }
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if(board[i][j] == num && i != row && j != col)
                    return false;
            }
        }
        return true;
    }
    private static void display(int[][] board) {
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
