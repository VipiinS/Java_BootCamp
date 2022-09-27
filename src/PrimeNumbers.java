public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        // check till sqrt(13)
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int c = 2;
        while(c * c <= n) { // similar to sqrt of n
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
    }
}
