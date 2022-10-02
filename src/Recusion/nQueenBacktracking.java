package Recusion;

public class nQueenBacktracking {

    public static void main(String[] args) {
        boolean[][] board = {
                {false,false,false,false},
                {false,false,false,false},
                {false,false,false,false},
                {false,false,false,false}
        };
        System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int row){ // true means the queen is placed
        if(row >= board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) { // we are checking whether the Q can be placed in every col in every iteration
            if(isSafe(board,row,col)){ // another function that checks whether the queen can be placed int hec column
                board[row][col] = true; // the queen is placed and the recursion all is done to check for queen placement in next column
                count += queens(board,row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board,int row, int col) {
        //vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row,col); // the maximum time you can go left until u reach a col end or a row end
        int maxRight = Math.min(row,board.length - col -1); // maximum time we can go right

        //diagonal left check
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }
        //diagonal right check
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element : row){
                if(element)
                    System.out.print("Q");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
    }
}
