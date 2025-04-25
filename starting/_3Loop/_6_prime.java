
public class _6_prime {
    public static void main(String[] args) {
        int a = 23, c = 0; // 1 o 23 dara just nisshas e bibajjito hbe..its called prime
        for (int i = 2; i <= a / 2; i++) { // all number tar half er besi num dia vag jaina
            if (a % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
