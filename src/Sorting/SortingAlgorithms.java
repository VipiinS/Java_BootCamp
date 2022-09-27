package Sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args){
            int[] arr={1,3,2,5,4,8,9,11,10,12,6,7};
            insertion(arr);
           // Selection(arr);
            //BubbleSort(arr);
            //cycle(arr);
            System.out.println(Arrays.toString(arr));
    }
    public static int[] BubbleSort(int[] nums){ //we get the max of array at the last index in each loop
        boolean swapped ;   // to check whether the array is already sorted to avoid sorting again
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){ //the element is checked with the next element
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                    swapped = true; // if the array is not sorted the swapped wil become true
                }
            }
            if (!swapped) // !false=true When the array is already sorted therefore loop break
                break; // the swpped is false henceit means the array is already sorted hence another pass of the array is not required
        }
        return nums;
    }
    public static void Selection(int[] arr){ //finds the Max element in the array and puts it in its correct index
        for(int i = 0; i < arr.length-1; i++){
            int lastIndex = arr.length - i - 1;  //finding the last index to find till which index Max should be found And to put the max elements
            int maxIndex = maxInd(arr,0,lastIndex); //method for finding the Max element up to last index
            swap(arr,maxIndex,lastIndex);
        }
    }
    public static int maxInd(int[] arr, int start, int last){
        int max = start;
        for(int i = start; i <= last; i++){  //to find the max element in the given range
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void insertion(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){ //somewhat opposite to bubble sort.
                if(arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {   // 'i' will be incremented only when i index element is in correct position
            // arr[i] -1 when [1,n] and arr[i] when [0,n]
            int correct = arr[i] - 1; // Eg.[1,2,3,4]  the index of element 3 is 3,2 is 2. if element at i=0 is 3 then the correct index of 3 is 3-1=2.
            if (arr[i] != arr[correct])// if the element is not in its correct index then its swapped
                swap(arr, i, correct);
            else
                i++; // if the element at 'i' is in its correct index i++
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
