import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 ={4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] smaller = nums1.length < nums2.length ? nums1 : nums2;
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;
        int last = -1; // -1 as the num ranges from 1,n
        // last is used to get unique results
        List<Integer> ansList = new ArrayList<>();

        for(int arr: smaller){
            if(arr != last && BinarySearch(larger,arr)){
                ansList.add(arr);
            }
            last = arr; // arr is assigned to last so that when the same number repeats,Binary search will not be repeated and the number will be skipped
        }
        int[] ans = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++){
            ans[i]=ansList.get(i);
        }
        return ans;
    }



    public static boolean BinarySearch(int[] arr,int target){
        int start=0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return true;
            if(target > arr[mid])
                start = mid +1;
            else
                end = mid -1;
        }
        return false;
    }
    public static int[] BubbleSort(int[] nums){ //we get the max of array at the last index in each loop
        boolean swapped = false;   // to check whether the array is already sorted to avoid sorting again
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){ //the element is checked with the next element
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                    swapped = true;
                }
            }
            if (!swapped) // !false=true When the array is already sorted therefore loop break
                break;
        }
        return nums;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
