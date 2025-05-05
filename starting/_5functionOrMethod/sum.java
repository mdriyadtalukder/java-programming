import java.util.*;

public class sum {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    static String name(String n) { // public na dileo hy
        return n;
    }

    public static void pr() {
        System.out.println("hello");
    }

    public static char chr(char c) {
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int result = add(a, b);
        System.out.println(result);
        System.out.println(sub(12.45f, 3.556f));
        System.out.println(name("PPPP"));
        pr();
        System.out.println(chr('k'));

    }
}