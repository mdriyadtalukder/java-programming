
import java.util.Arrays;

public class _11_ArraySort {
    public static void main(String[] args) {
        int[] ar = { 2, 4, 1, 5, 0, 6, 234, 122 };

        Arrays.sort(ar);
        System.out.println("Ascending");
        for (int i = 0; i < 8; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\ndescending");
        for (int i = 7; i >= 0; i--) {
            System.out.print(ar[i] + " ");

        }
    }
}
