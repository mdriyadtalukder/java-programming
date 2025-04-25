import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 0, 1, 3, 7, -1 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        ;

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
