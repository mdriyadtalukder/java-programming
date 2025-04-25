
import java.util.*;

public class _10_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n, r;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }
        System.out.println(sum);
    }

}