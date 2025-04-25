public class recursions {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // return n * factorial(n - 1);
        return n + factorial(n - 1);
    }
    // static void pract(int n){
    // for(int i=1;i<=10;i++){
    // System.out.print(n+" x "+i+" = "+n*i+"\n");

    // }

    // }

    static void pract(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4)); // we can do factorial using loop
        pract(4); // we can do factorial using loop
    }
}
