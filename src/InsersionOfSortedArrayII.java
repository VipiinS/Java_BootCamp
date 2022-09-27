import java.util.*;
public class InsersionOfSortedArrayII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int Start1 = 0;
        int Start2= 0;
        List <Integer> ansList = new ArrayList<>();
        while (Start1 < nums1.length && Start2 < nums2.length){

            if(nums1[Start1] < nums2[Start2])
                Start1++;
            else if(nums2[Start2] < nums1[Start1])
                Start2++;

            else{
                ansList.add(nums1[Start1]);
                Start1++;
                Start2++;
            }
        }
        int[] ans = new int[ansList.size()];
        for(int i = 0;i < ansList.size(); i++){
            ans[i]=ansList.get(i);
        }
        return ans;
    }
}