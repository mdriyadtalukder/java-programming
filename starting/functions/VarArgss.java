public class VarArgss {
    static int sum(int... arr) {
        int r = 0;
        for (int i : arr) {
            r += i;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3));
        System.out.println(sum()); // r er 1st value return krbe. and empty array pass hbe

    }
}
