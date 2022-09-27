import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 39, 49},
                {35, 45, 55, 70}
        };
        System.out.println(Arrays.toString(search(arr, 29)));
    }

    private static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length-1;
        while(r < matrix.length && c >= 0)
        {
            if(target == matrix[r][c])
                return new int[] {r,c};
            if(target > matrix[r][c])  //target is greater so row in reduced
                r++;
            else //target is smaller so column is reduced
                c--;
        }
        return new int[]{-1, -1};
    }
}
