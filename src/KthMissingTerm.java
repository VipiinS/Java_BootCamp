public class KthMissingTerm {
    public static void main(String[] args) {
        int[] nums={2,3,4,7,11};
        System.out.println(findKthPositive(nums,5));
    }
    public static int findKthPositive(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if(nums[mid]-(mid+1)<k)
                start = mid +1;
            else
                end = mid -1;
        }
        return start + k;
    }
}

