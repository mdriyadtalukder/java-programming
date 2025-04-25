import java.util.*;

public class Consonant {
    public static void main(String[] args) {
        char a, b;

        try (Scanner input = new Scanner(System.in)) {
            a = input.next().charAt(0);
        }
        b = Character.toLowerCase(a);
        if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') { // b>='a' && b<='z' means (a-z), then alphabet
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}
