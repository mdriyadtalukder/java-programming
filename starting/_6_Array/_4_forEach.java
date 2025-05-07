import java.util.*;

public class _4_forEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {};//ekhne just add krbo values
        String[] day = { "1. Sunday", "2. Monday", "3. Tuesday", "4. Wednesday", "5. Thursday", "6. Friday",
                "7. Saturday" };

        for (String i : day) {
            System.out.println(i);
        }

        System.out.println("Enter a num to find day: ");
        int n = sc.nextInt();

        System.out.println(day[n - 1]);

    }
}
