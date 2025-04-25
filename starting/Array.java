import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0, max, min;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);

    }
}
