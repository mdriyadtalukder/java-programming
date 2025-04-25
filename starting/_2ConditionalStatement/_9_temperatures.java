import java.util.*;

public class _9_temperatures {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("temperature conversion menu: ");
            System.out.println("1. Fahrenheit to celsius. ");
            System.out.println("2. Celsius to fahrenheit.");
            System.out.println("Choose a option");
            int f, c, ch = sc.nextInt();

            switch (ch) {
                case 1:

                    System.out.println("Enter Fahrenheit temperature: ");
                    f = sc.nextInt();
                    System.out.println((f - 32) / 1.8f);
                    break;
                case 2:
                    System.out.println("Enter Celsius temperature: ");
                    c = sc.nextInt();
                    System.out.println((1.8f * c) + 32);
                    break;

                default:
                    System.out.println("Invalid number");
            }
        }

    }
}
