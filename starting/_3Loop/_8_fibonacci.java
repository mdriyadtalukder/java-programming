
public class _8_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, fibo;
        System.out.print(a + " " + b);
        for (int i = 3; i < 6; i++) {
            fibo = a + b;
            System.out.print(" " + fibo);
            a = b;
            b = fibo;
        }
    }
}
