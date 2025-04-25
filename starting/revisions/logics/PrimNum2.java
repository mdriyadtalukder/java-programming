import java.util.*;

public class PrimNum2 {
    public static void main(String[] args) {
        int n, n2, c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            n2 = sc.nextInt();
        }

        for (int i = n; i <= n2; i++) {
            if (n == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++;
                }

            }
            if (c == 0) {
                System.out.println(i);
            }
            c = 0;
        }
    }
}
