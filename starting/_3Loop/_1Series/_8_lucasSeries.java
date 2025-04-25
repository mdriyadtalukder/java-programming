public class _8_lucasSeries {
    public static void main(String[] args) {
        // 2 1 3 4 7
        int f = 2, s = 1, next;
        System.out.print("1 2 ");
        for (int i = 3; i <= 5; i++) {
            next = s + f;
            System.out.print(next + " ");
            f = s;
            s = next;
        }

    }
}
