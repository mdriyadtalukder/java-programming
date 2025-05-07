import java.util.*;

public class _6_matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                ar[i][j] = sc.nextInt();
            }
        }
        // System.out.println("A = ");
        System.out.print("A = ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.print(" "+ar[i][j]);
                System.out.print("\t" + ar[i][j]);
            }
            System.out.println();
        }

    }
}
