import java.util.*;

public class _3_sumOfFloatNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat(), sum = 0.0f;
        for (float i = 1.5f; i <= n; i++) {
            sum = sum + i;

        }
        System.out.printf("%.2f", sum);
    }
}
