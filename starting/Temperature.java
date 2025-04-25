import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        double c, f;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Take celsius: ");
            c = input.nextDouble();
        }
        f = (double) 9 / 5 * c + 32;
        System.out.println(+f);

    }
}
