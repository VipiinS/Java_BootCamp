public class XORFromAtoB {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println((xor(b) ^ xor(a-1)));

        // another approach but wll exceed time limit
        int ans2=0;
        for(int i = a; i <= b; i++)
            ans2 ^= i;
        System.out.println(ans2);
    }

    private static int xor(int n) {
        if(n % 4 == 0)
            return n;
        if(n % 4 == 1)
            return 1;
        if(n % 4 == 2)
            return n+1;
        return 0;
    }

}
