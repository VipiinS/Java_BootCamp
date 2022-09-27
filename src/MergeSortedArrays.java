import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int i = 3; // for nums1
        int j = 0; // for nums2
        while(i < nums1.length & j < nums2.length){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
