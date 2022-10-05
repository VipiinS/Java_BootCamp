public class evenPair {
    // the problem given in the Propel Drive.
    public static boolean SearchingChallenge(String str) {
        int count;
        for(int i = 0;i < str.length() - 1; i++) {
            String num = "";
            count = 0;
            for (int j = i; j < str.length() && (str.charAt((j)) - '0') >= 0 && (str.charAt((j)) - '0') <= 9; j++) {
                num += str.charAt(j);
                if((Integer.parseInt(num) % 2 == 0)) {
                    num = "";
                    count++;
                    if (count > 1)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        // keep this function call her
        System.out.print(SearchingChallenge("f09r27i8e96"));
    }
}
