import java.util.*;

public class _1_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt(), sum = 0;
        System.out.print("1 + 3 + 5 +......+ " + n + " = "); // 2 kore barbe
        for (int i = 1; i <= n; i=i+2) {
            sum = sum + i;
        }
        System.out.print(sum);
    }

}
