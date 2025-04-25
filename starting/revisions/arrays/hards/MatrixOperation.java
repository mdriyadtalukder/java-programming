import java.util.*;

public class MatrixOperation {
    public static void main(String[] args) {
        int r, c, sum = 0, sum2 = 0, sum3 = 0;

        try (Scanner sc = new Scanner(System.in)) {
            r = sc.nextInt();
            c = sc.nextInt();
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.printf("Arr[%d][%d] = ", i, j);
                    arr[i][j] = sc.nextInt();

                }
            }
            System.out.print("Arr =");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j) {
                        System.out.print("\t" + 1);
                        sum = sum + arr[i][j];
                    }
                    if (i < j) {
                        System.out.print("\t" + 2);
                        sum2 = sum2 + arr[i][j];
                    }
                    if (i > j) {
                        System.out.print("\t" + -1);
                        sum3 = sum3 + arr[i][j];
                    }

                }
                System.out.println();

            }

        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}
