import java.util.*;

public class _2_ABCPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.printf("%c ", c + 64);
                // System.out.printf("%c ", r+ 64); //every col e same alphabet show krbe
            }
            System.out.println();
        }

    }
}
