public class SlidingWindowStatic {
    public static void main(String[] args) {
        int[] arr= {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int maxSubArraySize = 3;
        System.out.println(SlidingWindow(arr,maxSubArraySize));
    }

    private static int SlidingWindow(int[] arr, int k) {
        int currSum = 0; // holds the sum of current window sum
        int maxValue = Integer.MIN_VALUE; // holds the max of the subarray in the array

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];  // adding the last element of each window and later subtracted in below loop

            if(i >= k-1){
                maxValue = Math.max(currSum,maxValue);
                currSum -= arr[i-(k-1)]; //subtracting the last element in each window
            }
        }
        return maxValue;
    }
}
