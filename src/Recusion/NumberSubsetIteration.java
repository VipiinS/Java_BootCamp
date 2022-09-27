package Recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSubsetIteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subSetDuplicates(arr);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> subSet(int[] arr){  // returning a list containing a list
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // first an empty array is added to the outer list
        for( int num : arr){ // for each number in arr
            int n = outer.size(); // the size of the outer is taken
            for(int i = 0; i < n; i++){ // the loop will be repeated for outer loop size
                List<Integer> internal = new ArrayList<>(outer.get(i)); //a new list is created ,a copy of the outer list is copied to this internal list
                internal.add(num);// and for that list num is added
                outer.add(internal); // internal list is added to the outer list
            }
        }
        return outer;// outer list us returned
    }

    public static List<List<Integer>> subSetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end = 0; // a start and end pointer is used
        for (int i = 0; i < arr.length; i++) {
            start = 0; // the start is always at the starting index of the outer loop,except when...
            if(i > 0 && arr[i] == arr[i-1]){ // the element at its previous element is equal
                start = end + 1;// he start will be equal to the end index of outer + 1
            }
            int n = outer.size();
            end = n - 1;
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j)); //the elemets of the outer list is taken and the elements in arr is added to them one by one
                internal.add(arr[i]);
                outer.add(internal); // the internal list is then added to the outer list
            }

        }
        return outer;
    }
}
