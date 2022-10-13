package Recusion.LeetcodeMedium;
//1219. Path with Maximum Gold
//In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
//Return the maximum amount of gold you can collect under the conditions:
//Every time you are located in a cell you will collect all the gold in that cell.
//From your position, you can walk one step to the left, right, up, or down.
//You can't visit the same cell more than once.
//Never visit a cell with 0 gold.
//You can start and stop collecting gold from any position in the grid that has some gold.
//Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
//Output: 24
//Explanation:
//[[0,6,0],
// [5,8,7],
// [0,9,0]]
//Path to get the maximum gold, 9 -> 8 -> 7.

public class pathWithMaxGold {
    public static void main(String[] args) {
        int[][] arr = {
                {0,6,0},
                {5,8,7},
                {0,9,0}
        };
        System.out.println(getMaximumGold(arr));
    }
    public static int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] > 0){
                    int gold = path(grid,i,j,m,n,visited);
                    max = Math.max(max,gold);
                }
            }
        }
        return max;
    }

    private static int path(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        if(i < 0 || j < 0 || i >= m || j >= n)
            return 0;
        if(grid[i][j] == 0)
            return 0;
        if(visited[i][j])
            return 0;
        visited[i][j] = true;
        int left = path(grid,i ,j - 1,m,n,visited);
        int right = path(grid,i,j + 1,m,n,visited);
        int up = path(grid,i - 1,j,m,n,visited);
        int down = path(grid,i + 1,j,m,n,visited);
        visited[i][j] = false;
        return grid[i][j] + Math.max(left,Math.max(right,Math.max(up,down)));
    }
}
