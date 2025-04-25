import java.util.*;
public class formatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int f = x;
            int count = 0;
            while (x != 0) {
                x = x / 10;
                count++;
            }
            int a = s1.length();
            int b = 16 - count;

            System.out.print(s1);
            if (count == 3) {
                for (int k = a - 1; k <= b; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
            } else if (count == 2) {
                for (int k = a - 1; k <= b - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("0" + f);
            } else if (count == 1) {
                for (int k = a - 1; k <= b - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("00" + f);
            } else if (count == 0) {
                for (int k = a - 1; k <= b - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print("00" + f);
            }
            System.out.print("\n");
        }
        System.out.println("================================");
    }
}
