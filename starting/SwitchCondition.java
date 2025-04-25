import java.util.*;

public class SwitchCondition {
    public static void main(String[] args) {
        int a, b;
        try (Scanner input = new Scanner(System.in)) {
            a = input.next().charAt(0);
        }
        b = Character.toLowerCase(a);

        switch (b) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println("Vowel");
                break; // every case er por break hy

            default:
                System.out.println("Consonant");

        }

    }
}
