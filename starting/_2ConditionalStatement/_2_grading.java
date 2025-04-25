import java.util.*;

public class _2_grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 80) {
            System.out.println("A+");
        } else if (a >= 70 && a <= 79) {
            System.out.println("A");
        } else if (a >= 40 && a <= 69) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
