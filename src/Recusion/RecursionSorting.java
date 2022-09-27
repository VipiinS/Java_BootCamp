package Recusion;

import java.util.Arrays;

public class RecursionSorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = {5,4,3,2,1};
        int[] arr4 = {5,4,3,2,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println("bubbleSort " +Arrays.toString(arr));
        selectionSort(arr2,arr2.length,0,0);
        System.out.println("selectionSort " +Arrays.toString(arr2));
        mergeSort(arr3);
        System.out.println("mergeSort " + Arrays.toString(arr3));
        mergeSortInPlace(arr4,0,arr4.length);
        System.out.println("mergeSortInPlace" +Arrays.toString(arr4));
    }

    private static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0)
            return;
        if(r > c){  // r is used to set limit to the traversal of array,it decreases with each traversal,as the last element after each traversal is max element, and it does not need to be sorted again
            if(arr[c] > arr[c + 1]) {
                //swap
                swap(arr,c,c+1);
                bubbleSort(arr, r, c + 1);
        }
            }
        else
                bubbleSort(arr,r - 1, 0); // after one traversal of array the r is reduced by 1 index and c is et to 0 again
        }
    private static void selectionSort(int[] arr, int r, int c ,int max){
        if(r == 0) // will end the recursion when r==0
            return;
        if(r > c) {
            if (arr[c] > arr[max]) { // if element is > max,in the recursion call, c is sent instead of max
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max); // else max is sent
            }
        }
        else{  //after traversing through the array once,the max element is swapped with the element at the end
            // swap
            swap(arr,max,r-1);
            selectionSort(arr,r-1,0,0); // the c and max is set to 0 again for traversing from start.
        }
    }
    public static void swap(int[] arr, int a, int b){ // method to swap
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length == 1)  // base condition, when the array contains only 1 element,it is returned
            return arr;
        int mid = arr.length / 2;  // to find the mid of the array to split
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)); //left copy of array is sent up to the  call
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid ,arr.length));// right copy

        return merge(left,right); //the array is merged
         }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0; // i is for left array, j is for right array
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }


        while(i < first.length){ // if left array size is larger than right array
            mix[k] = first [i]; // the remaining elements in left array is sent to mix array
            i++;
            k++;
        }
        while ((j < second.length)){ // if right array is larger than left array,the elements og right array is sent to mix array
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void mergeSortInPlace(int[] arr, int s, int e) { // will sort array without creating new arrays in each recursion calls
        if (e - s == 1) // if the size of array is 1,it'll return
            return;
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid); // left half of the array is sent
        mergeSortInPlace(arr, mid , e); //right half

        mergeInPlace(arr,s,mid,e); // the two half are sorted and merged

    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) { //new array called 'mix' is created .
        int[] mix = new int[e - s]; // e - s gives the length of the array to be created
        int i = s; // used for left half array
        int j = m;// for right half array
        int k = 0; // k will be used as index for mix array
        while(i < m && j < e){ // when the both half is of same size
            if(arr[i] > arr[j]){// the value greater in two halves is assigned to first index of mix and i is incremened
                mix[k] = arr[i];
                i++; // j is not incremented until the next i element is check and it j is greater than i element,j is incremented or i is incremented again
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){ // the un assigned array for assigned at the end of the mix element
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++){ // the mix array is transferred to arr array to return
            arr[s+l] = mix [l]; // s+l is used so that correct value will be transferred to correct index of arr
        }
    }
}
