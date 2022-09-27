import java.util.Arrays;

public class SpecialArrayWithXElemetsGreaterThanEqualToX {
    public static void main(String[] args) {
        int[]arr = {3,5};
        System.out.println(specialArray(arr));
    }

    private static int specialArray(int[] arr) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) /2;
            int count = find(arr,mid);
            if (mid == count) {
                return mid;
            }
            if (count > mid) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    public static int find(int[] nums , int mid) {
        int count = 0;
        for(int element:nums) {
            if (element>=mid) {
                count++;
            }
        }
        return count;
    }
}
