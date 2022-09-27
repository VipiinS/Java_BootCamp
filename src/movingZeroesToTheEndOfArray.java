import java.util.Arrays;

public class movingZeroesToTheEndOfArray {
    public static void main(String[] args) {
        int[] arr = {0,3,1,0,5,0,1,0,4};
        movesZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void movesZeroesToEnd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){ // if the element is not zero,it will be copies to previous element
                //and i & count is incremented
                arr[count] = arr[i];
                count++;
            }
            // if th eleemnt is zero,i is only incremented,therefore if th next non-zero element is found,it'll be copied to the count element(zeroth element)
        }
        while(count < arr.length){ // now count will be in an index from where all the element scan be made zero
            arr[count] = 0;
            count++;
        }
    }
}
