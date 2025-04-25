public class _2_Breaks {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i == 10) {
                break;
            }
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
