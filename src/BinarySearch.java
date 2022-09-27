public class BinarySearch {
    public static void main(String[] args) {
        int[] num ={0,1,2,3,4,6,8,9};
        int target=6;
        System.out.println(search(num,target));
    }
    public static int search(int[] num, int target) {
        int start = 0;
        int end = num.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == num[mid])
                return mid;
            if(target > num[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        return -1;
    }
}
