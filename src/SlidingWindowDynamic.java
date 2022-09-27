public class SlidingWindowDynamic {
    public static void main(String[] args) {
        int[] arr= {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int target = 3;
        System.out.println(dynamicSlidingWindow(arr,target));
    }

    private static int dynamicSlidingWindow(int[] arr, int target) {
        int windowStart = 0; // index of window start
        int currSum = 0; //sum of the current window
        int minWindowSize = Integer.MAX_VALUE; //size of the window
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            currSum += arr[windowEnd]; //adding the elements in the window
            while(currSum >= target){  // when the window sum is >= target, it is checked whether its size is lesser than the minWindow
                minWindowSize = Math.min(minWindowSize,(windowEnd - windowStart + 1));
                currSum -= arr[windowStart]; //the first element is subrated to check fr more optimal soln
                windowStart++; 
            }
        }return minWindowSize;
    }
}
