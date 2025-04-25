import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 0,n1, n2 = 1, r;
        try (Scanner sc = new Scanner(System.in)) {
            n1=sc.nextInt();
        }
        System.out.println(n);
        System.out.println(n2);
        for (int i = 3; i <=n1; i++) {
            r = n + n2;
            n = n2;
            n2 = r;
            System.out.println(r);

        }
    }

}
