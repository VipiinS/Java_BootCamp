package Recusion;

public class nKnightBacktracking {
    public static void main(String[] args) {
    boolean[][] board = new boolean[4][4];
    knight(board,0,0,4);
    }
    static void knight(boolean[][] board,int row,int col,int target){
        if(target == 0) { // display the results if all the knights are placed
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length - 1 && col == board.length - 1) // if the row and col crosses the board,return
            return;
        if(col == board.length) { // if all the boxes are completed in a line,move on to next line
            knight(board, row + 1, 0, target);
            return;
        }
        if(isSafe(board, row,col)){ // placing in the same line,row remains same,col ++
            board[row][col] = true; // knight placed so index changed to true
            knight(board, row,col + 1,target - 1);
            board[row][col] = false; // backtracking, during returning of function after displaying the result
            knight(board, row,col + 1,target);
        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) { //case checks for knight
        if(isValid(board, row - 2, col - 1))
            if(board[row-2][col-1])
                return false;
        if(isValid(board, row - 2 ,col + 1))
            if(board[row-2][col+1])
                return false;
        if(isValid(board,row-1,col+2))
            if(board[row-1][col+2] )
                return false;
        if(isValid(board, row + 1,col + 2))
            if(board[row+ 1][col+2])
                return false;
        if(isValid(board, row + 2, col - 1) )
            if(board[row + 2][col - 1] )
                return false;
        if(isValid(board, row + 2 ,col + 2))
            if(board[row + 2][col + 2])
                return false;
        if(isValid(board, row - 1, col - 2))
            if(board[row-1][col-2] )
                return false;
        if(isValid(board, row + 1, col - 2))
            if(board[row + 1][col - 2])
                return false;
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) { // to check whether the row and column for each case check is inside the chess board
        return row >= 0 && col >= 0 && row < board.length && col < board.length;
    }

    private static void display(boolean[][] board) { // display the result depending on elements boolean value
        for(boolean[] row:board){
            for(boolean element : row){
                if(element)
                    System.out.print("K"); // true means knight placed
                else
                    System.out.print("X"); // false means empty index
            }
            System.out.println();
        }
    }
}