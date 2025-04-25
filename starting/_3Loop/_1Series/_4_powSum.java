public class _4_powSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println(sum);
    }
}
