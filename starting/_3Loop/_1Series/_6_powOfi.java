public class _6_powOfi {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println(sum);
    }
}
