package Recusion;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,5,7,9,11,34,46,57,89};
        int target = 11;
        int ans = BS(arr,target,0,arr.length - 1);
        System.out.println(ans);
    }
    public static int BS(int[] arr,int target,int s, int e){

        if(s >= e)
            return -1;

        int mid = s +(e-s)/2;

        if(target == arr[mid])
            return mid;

        if(target > arr[mid])
            return BS(arr,target,mid+1,e);

        return BS(arr,target,s,mid-1);
    }
}
