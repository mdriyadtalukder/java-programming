public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");

                }

            }
            System.out.println();
        }
    }
}
