import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        int n;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input a number: ");
            n = input.nextInt();
        }
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
