public class OddEven {
    public static void main(String[] args) {
        System.out.println(isOdd(22));
    }

    private static boolean isOdd(int i) {
        return ((i & 1) == 1);
    }
}
