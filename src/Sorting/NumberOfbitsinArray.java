package Sorting;
// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/
import java.util.Arrays;
 //given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 //Return the array after sorting it.
  //Input: arr = [0,1,2,3,4,5,6,7,8]
 //Output: [0,1,2,4,8,3,5,6,7]
 //Explantion: [0] is the only integer with 0 bits.
 //[1,2,4,8] all have 1 bit.
 //[3,5,6] have 2 bits.
 //[7] has 3 bits.
 //The sorted array by bits is [0,1,2,4,8,3,5,6,7]


// USED Indeger.bitCount(array);  to count the number of bits ina element
// and 10001 is multiplied onto them
// they are then sorted
// and modulus of 10001 is done to get the element back
public class NumberOfbitsinArray {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8};
        ans(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void ans(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) *11 ;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 11;
        }
    }
}
