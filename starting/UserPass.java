import java.util.*;

public class UserPass {
    public static void main(String[] args) {
        String name = "riyad";
        int pass = 123456;
        int p;
        String s;
        int c = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (c != 1) {
                System.out.println("Enter user name: ");
                s = sc.nextLine();

                System.out.println("Enter user Password: ");
                p = sc.nextInt();
                sc.nextLine();
                if (name.equals(s) && pass == p) {
                    c++;
                    System.out.println("User login successfully!");

                } else {
                    System.out.println("Wrong something!! try again.");

                }

            }
        }
    }
}
