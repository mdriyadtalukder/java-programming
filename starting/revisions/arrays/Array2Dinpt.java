import java.util.*;

public class Array2Dinpt {
    public static void main(String[] args) {
        int r, c;
        try (Scanner sc = new Scanner(System.in)) {
            r = sc.nextInt();
            c = sc.nextInt();
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.printf("arr[%d][%d] = %d ", i, j, arr[i][j]);
                    System.out.println();

                }
            }
        }
    }
}