import java.util.*;

public class _5_evenSumOfMtoNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
