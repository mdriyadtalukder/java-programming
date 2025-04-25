import java.util.*;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n = 0, n1 = 1, n2, r, s;
        try (Scanner sc = new Scanner(System.in)) {
            n2 = sc.nextInt();
            s = sc.nextInt();
        }
        for (int i = 3; i <= n2; i++) {
            r = n + n1;
            n = n1;
            n1 = r;
            if (s == 1) {
                System.out.println(0);
                break;
            }
            if (s == 2) {
                System.out.println(1);
                break;
            }
            if (s == i) {
                System.out.println(r);
            }

        }

    }
}
