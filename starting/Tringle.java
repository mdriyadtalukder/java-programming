import java.util.*;

public class Tringle {
    public static void main(String[] args) {
        double h, b, r;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Take input of height: ");
            h = input.nextDouble();
            System.out.println("Take input of base: ");
            b = input.nextDouble();
        }
        r = (double) 1 / 2 * h * b;
        System.out.println(+r);

    }
}
