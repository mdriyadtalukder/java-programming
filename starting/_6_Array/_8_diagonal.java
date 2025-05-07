import java.util.*;

public class _8_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumofDiagonal = 0, sumOfupper = 0, sumOfLowerelement = 0;
        int[][] A = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumofDiagonal = sumofDiagonal + A[i][j];
                }
                if (i < j) {
                    sumOfupper = sumOfupper + A[i][j];
                }
                if (i > j) {
                    sumOfLowerelement = sumOfLowerelement + A[i][j];
                }
            }
        }

        System.out.println(sumofDiagonal);
        System.out.println(sumOfupper);
        System.out.println(sumOfLowerelement);

    }
}
