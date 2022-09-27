import java.util.Arrays;

public class BinarySearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(Search(matrix,3)));
    }
    public static int[] BinarySearch(int[][] matrix, int row /* row to be searched */, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid])
                return new int[] {row,mid};
            if(target > matrix[row][mid])
                cStart = mid +1;
            else
                cEnd = mid -1;
        }
        return new int[] {-1,-1};
    }

    private static int[] Search(int[][] matrix, int target) {
        int rows = matrix.length; //row length
        int col = matrix[0].length;// col length
        int rStart = 0; //start for BS
        int rEnd = rows-1; //end for BS
        int cMid = col/2; // to find middle colum to check
        if (rows == 1)
            return BinarySearch(matrix, 0, 0, matrix[0].length-1, target);
        while(rStart < rEnd){
            int mid = rStart + (rEnd - rStart) /2;  // to find middle row
            if(target == matrix[mid][cMid])
                return new int[] {mid,cMid};
            if(target > matrix[mid][cMid]) // as the matrix is sorted, if target is greater then mid,the possible position will be after mid index
                rStart = mid;
            else
                rEnd =mid;
        }
        // only 2 rows will remain after the end of 'while' loop
        if(target == matrix[rStart][cMid]) //upper middle cell
            return new int[] {rStart, cMid};
        if(target == matrix[rStart + 1][cMid])  //lower middle cell
            return new int[]{rStart + 1, cMid};
        if(target < matrix[rStart][cMid-1]) //upper left section
            return BinarySearch(matrix,rStart,0,cMid,target);
        if(target > matrix[rStart][cMid+1] && target <= matrix[rStart][col-1])  // upper right section
            return BinarySearch(matrix,rStart,cMid+1,col -1,target);
        if(target < matrix[rStart+1][cMid-1]) //lower left section
            return BinarySearch(matrix, rStart+1,0,cMid-1,target);
        else     //lower right section
            return BinarySearch(matrix,rStart+1, cMid+1,col-1,target);
    }
}
