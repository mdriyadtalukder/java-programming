
public class SqureSum {
    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (int) Math.pow(i, 2); // i dile proti tar upor tar shongkhar e power hbe..like 3^3,4^4
        }
        System.out.println(sum);
    }
}
