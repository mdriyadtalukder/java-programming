import java.util.*;
public class _12_Palindrome {
    public static void main(String[] args) {
        int n, r, temp, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("Palindrom number");
        } else {
            System.out.println("Not Palindrom number");
        }
    }
}
