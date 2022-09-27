
import java.util.*;

public class CheckIfItsDoubleExists {

    public static void main(String[] args) {
        int[] arr={-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            if (BinarySearch(arr,2*j, j))
                return true;
        }
        return false;
    }
    public static boolean BinarySearch(int[] num, int target, int n){
        int start = 0;
        int end = num.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == num[mid] && target != n )
                return true;
            if(target > num[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        return false;
    }
}
