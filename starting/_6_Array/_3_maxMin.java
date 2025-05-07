import java.util.*;

public class _3_maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            ar[i] = sc.nextInt();
        }
        int max = ar[1], min = ar[2];

        for (int i = 0; i < 5; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
