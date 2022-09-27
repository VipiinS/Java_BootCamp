public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(ans(6));
    }

    private static int ans(int n) {
        int ans = 0;
        int last = 0;
        int base = 5;
        while (n > 0) {
            last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;

        }
        return last;
    }
}
