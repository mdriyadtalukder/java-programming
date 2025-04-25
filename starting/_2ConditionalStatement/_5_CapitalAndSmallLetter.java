import java.util.*;

public class _5_CapitalAndSmallLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Small");
        } else {
            System.out.println("Capital");
        }
    }
}
