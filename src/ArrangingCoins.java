public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int num) {
        long start = 0;
        long end = num;
        long mid;
        long curr;
        while (start <= end) {
            mid = start + (end - start) / 2;
            curr = mid * (mid + 1) / 2;

            if (curr == num)
                return (int)mid;
            if (num < curr)
                end = mid - 1;
            else
                start = mid + 1;

        }
        return (int)end;
    }
}
