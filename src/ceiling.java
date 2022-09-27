public class ceiling {
    public static void main(String[] args) {
        int[] arr = {3,5};
        System.out.println(Ceiling(arr,9));
    }

    public static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        if(target == arr[start] || target == arr[end])
            return target + 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        return start;
    }
}
