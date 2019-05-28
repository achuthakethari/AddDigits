package AddDigits;

public class Digits {
    public static void main(String args[]) {
        int k;
        for (k = 100; k < 1000; k++) {
            int x = k % 10;
            int y = k / 100;
            int a = k / 10;
            int z = a % 10;

            if ((y + z) == x)
                System.out.println(k);
        }
    }
}
