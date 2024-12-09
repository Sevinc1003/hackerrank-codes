import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger> ededler = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            BigInteger n = new BigInteger(input);
            ededler.add(n);

        }

        for (BigInteger eded : ededler) {

            if (eded.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0
                    || eded.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                System.out.println(eded + " can't be fitted anywhere.");
            } else {
                System.out.println(eded + " can be fitted in:");


                if (eded.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        eded.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }

                if (eded.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        eded.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }

                if (eded.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        eded.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }

                if (eded.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        eded.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                }
            }
        }
    }
}
