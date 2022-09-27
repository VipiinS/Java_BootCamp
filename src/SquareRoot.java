public class SquareRoot {
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(Sqrt(x));
    }
    public static int Sqrt(int x) {
        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (mid == x/mid)
                return mid;
            if(mid > x/mid)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}
