public class CountSetBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n*-1));
        System.out.println(ans(n));
    }

    private static int ans(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}
