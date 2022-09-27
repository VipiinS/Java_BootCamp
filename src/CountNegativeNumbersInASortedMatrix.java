public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {4, 3, 2, -1},
                {3, 2, -1, -1},
                {3, 2, -1, -1},
                {-1,-1,-2,-3}
        };
        System.out.println(bruteForce(arr));

        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0;i < row; i++){
            int start = 0;
            int end = arr[i].length-1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[i][mid] >= 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            count += col - start;
        }
        System.out.println(count);;

    }

    private static int bruteForce(int[][] arr) {
        int count=0;
        for(int i=0; i <= arr.length-1; i++){
            for(int j=0; j <= arr[0].length-1 ;j++){
                if(arr[i][j]<0)
                    count++;
            }
        }
        return count;
    }
}

