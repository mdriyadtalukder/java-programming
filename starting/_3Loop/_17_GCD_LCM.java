import java.util.*;

public class _17_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n2 = sc.nextInt(), rem, num = n, num2 = n2;

        while (n2 != 0) {
            rem = n % n2;
            n = n2;
            n2 = rem;

        }

        // lo sha go
        int gcd = n;

        // go sha go
        int lcm = (num * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
