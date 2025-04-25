import java.util.*;

public class _9_Afibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1, fibo;
        for (int i = 3; i <= 10; i++) {
            fibo = a + b;
            if (i == n) {
                System.out.println(fibo);
            }
            a = b;
            b = fibo;
        }

    }
}
