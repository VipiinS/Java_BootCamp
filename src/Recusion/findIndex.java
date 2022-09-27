package Recusion;

import java.util.*;


public class findIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6};
        System.out.println((findIndexRet(arr,4,0)));
    }
    public static ArrayList <Integer> findIndexRet(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>(); // new list is created in every call
        if(index == arr.length)
            return list;
        if(arr[index] == target){
            list.add(index); // index is added,but in every call the list is created new and will have only one element stored
        }
        ArrayList<Integer> ansFromBelowCalls = findIndexRet(arr,target,index+1);

        list.addAll(ansFromBelowCalls); // all the ans from the ansFromBelowCalls are added to list
        return list;
    }
}
