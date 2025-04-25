import java.util.*;

public class _4_factorial {
    public static void main(String[] args) {

        // 4!=1*2*3*4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for (int i = 1; i <= n; i++) {
            c = c * i;
        }
        System.out.println(c);
    }

}
