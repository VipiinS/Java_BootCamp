public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        if(num == 1)
            return true;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid <= 0)
                return false;
            if(mid==(num/mid))
                return true;
            if(mid > num/mid)
                end = mid -1;
            else
                start = mid +1;
        }
        return false;
    }
}
