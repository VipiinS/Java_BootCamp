package Sorting;

import java.util.Arrays;

public class rankingElements {
    public static void main(String[] args) {
        int[] arr = {40,10,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int [] sorted = arr.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if(arr[i] == sorted[j]){
                    arr[i] = j + 1;
                }
            }
        }
    return arr;
    }
}
