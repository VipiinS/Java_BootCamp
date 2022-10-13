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
        //System.out.println(solve(board));
        char[][] charBoard = {
                {'5','3','.','.','.','.','.','1','2'},
                {'6','7','2','1','9','5','3','4','8'},
                {'1','9','8','3','4','2','5','6','7'},
                {'8','5','9','7','6','1','4','2','3'},
                {'4','2','6','8','5','3','7','9','1'},
                {'7','1','3','9','2','4','8','5','6'},
                {'9','6','1','5','3','7','2','8','4'},
                {'2','8','7','4','1','9','6','3','5'},
                {'3','4','5','2','8','6','1','7','9'}
        };
        int[][] testBoard = new int[9][9];
        covert(charBoard,testBoard);
        System.out.println(solve(testBoard));
        convertchar(charBoard,testBoard);

    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        // for finding the empty cell to put some number in
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }/*
             if an empty cell is found,
             then the first for loop does not need to be iterated,
             hence the loop is broken */
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
                if(solve(board)) { // as the above number is placed we check for next cell
                    System.out.println();
                    display(board);
                    return true;
                }
                else // if the checked cell is false,that means the number placed ine the first cell is wrg,hence backtracking
                    board[row][col] = 0; // BACKTRACKING
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int row,int col, int num){

        for (int i = 0; i < board.length; i++) {
            //row check
            if(board[row][i] == num)
                return false;

            for (int[] nums : board) {
            // check if the number is in the col
                if (nums[col] == num){
                    return false;
                }
            }
        }
        // check for 3x3 box
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
    // to display the board
    private static void display(int[][] board) {
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    // for leetcode,converting character[] to int[]
    static void covert(char[][] charboard,int[][] testBoard){
        System.out.println("inside from char covert");
        for (int i = 0; i < charboard.length; i++) {
            for (int j = 0; j < charboard.length; j++) {
                if(charboard[i][j] != '.'){
                    testBoard[i][j] = charboard[i][j] - '0';
                }
                else
                    testBoard[i][j] = 0;
            }
        }
    }
    static void convertchar(char[][] charboard,int[][] testboard){
        System.out.println("int[][] to char[][]");
        for (int i = 0; i < charboard.length; i++) {
            for (int j = 0; j < charboard.length; j++) {
                charboard[i][j] = (char) (testboard[i][j]);
            }
        }
    }
}
