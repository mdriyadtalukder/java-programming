import java.util.*;
import java.math.BigInteger;
//import java.io.*;

public class DataType2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // -9223372036854775808L
            // 9223372036854775807L
            BigInteger b = sc.nextBigInteger(); // for float BigDecimal

            if (b.compareTo(BigInteger.valueOf(-9223372036854775808L)) < 0
                    || b.compareTo(BigInteger.valueOf(9223372036854775807L)) > 0) { // 0 means -9223372036854775808L
                                                                                    // x.compareTo(y) < 0 means x < y.
                System.out.println(b + " can't be fitted anywhere.");
            } else {
                System.out.println(b + " can be fitted in:");

                if (b.compareTo(BigInteger.valueOf(-128)) >= -0 && b.compareTo(BigInteger.valueOf(127)) <= 0) {
                    System.out.println("* byte");
                }
                if (b.compareTo(BigInteger.valueOf(-32768)) >= 0 && b.compareTo(BigInteger.valueOf(32767)) <= 0) {
                    System.out.println("* short");

                }
                if (b.compareTo(BigInteger.valueOf(-2147483648)) >= 0 && b.compareTo(BigInteger.valueOf(2147483647)) <= 0) {
                    System.out.println("* int");
                }
                if (b.compareTo(BigInteger.valueOf(-9223372036854775808L)) >= 0
                        && b.compareTo(BigInteger.valueOf(9223372036854775807L)) <= 0) {
                    System.out.println("* long");
                }

            }
        }

        // long l = sc.nextLong();
        // try {
        // if (l >= -128 && l <= 127) {
        // System.out.println(l + " can be fitted in:");
        // System.out.println("* byte");
        // System.out.println("* short");
        // System.out.println("* int");
        // System.out.println("* long");
        // } else if (l >= -32768 && l <= 32767) {
        // System.out.println(l + " can be fitted in:");
        // System.out.println("* short");
        // System.out.println("* int");
        // System.out.println("* long");
        // } else if (l >= -2147483648 && l <= 2147483647) {
        // System.out.println(l + " can be fitted in:");
        // System.out.println("* int");
        // System.out.println("* long");
        // } else {
        // System.out.println(l + " can be fitted in:");
        // System.out.println("* long");
        // }
        // } catch (Exception e) {
        // System.out.println(sc.next() + " can't be fitted anywhere.");
        // }


    }
}