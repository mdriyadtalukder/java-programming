import java.util.*;

public class _7_primeMtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), c = 0, totalp = 0;
        ;

        for (int i = n; i <= m; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                System.out.println("Prime " + i);
                totalp++;
            }
            c = 0;
        }
        System.out.println("total prime: " + totalp);
    }

}
