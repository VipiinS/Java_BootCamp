public class SquareRootPrecise {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        System.out.println(ans(n,precision));
        System.out.printf("%.5f",ans(n,precision));
    }

    private static double ans(int n, int precision) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(m*m == n) {
                return m;
            }
            if (m * m > n)
                e = m -1;
            else
                s = m + 1;
        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while(root * root <= n)
                root += incr;
        root -= incr;
        incr /= 10;
        }
        return root;
    }
}
