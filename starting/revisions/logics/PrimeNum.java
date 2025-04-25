import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        int n, c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }
}