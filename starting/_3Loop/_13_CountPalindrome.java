import java.util.*;

public class _13_CountPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), r, sum = 0, temp, count = 0;

        for (int i = n; i <= m; i++) {
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;

            }
            if (i == sum) {
                System.out.println("Palindrome" + sum);
                count++;
            }
            sum = 0;
        }
        System.out.println(count);
    }

}
