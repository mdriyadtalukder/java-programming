import java.util.*;

public class _8_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(4 + 2);
                break;
            case '-':
                System.out.println(4 - 2);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
