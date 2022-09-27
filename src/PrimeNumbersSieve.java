public class PrimeNumbersSieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] Prime = new boolean[n+1]; // array will be always false when initialised
        sieve(n,Prime);

    }
// false means prime
    private static void sieve(int n, boolean[] prime) {
        for(int i = 2; i*i <= n; i++){
            if(!prime[i]){ //  !false = true
                for(int j = i*2; j <= n; j+=i){
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!prime[i])
                System.out.print(i + " ");
        }
    }
}
