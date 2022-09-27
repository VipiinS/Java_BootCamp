public class PivotInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2};
        int pivot = pivotIndex(arr);
        System.out.println(pivot);
    }
    public static int pivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1])
                return mid;
            if(arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[mid] <arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
