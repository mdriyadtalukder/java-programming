public class Unary {
    public static void main(String[] args) {
        int a = 2;
        int b = 24;
        int r, r2;
        r = +b; // unary plus
        r2 = -a; // unary minus

        System.out.println(+r);
        System.out.println(+r2);
        System.out.println(++a); // age barbe
        System.out.println(a++); // next time a pele barbe
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(a);
        System.out.println(b);
    }
}
