public class _16_strongNumber {
    public static void main(String[] args) {
        int n = 123, sum = 0, temp = n, r, fact;
        // 123=1!+2!+3!=123 hote hbe..
        while (temp != 0) {
            {
                r = temp % 10;
                fact = 1;
                for (int i = 1; i <= r; i++) {
                    fact = fact * i;
                }
                sum = sum + fact;
                temp = temp / 10;

            }

        }

        if (n == sum) {
            System.out.println("Strong num");
        } else {
            System.out.println("Not strong num");
        }
    }
}
