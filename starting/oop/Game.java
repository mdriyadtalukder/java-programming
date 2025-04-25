import java.util.Random;
import java.util.Scanner;

class Game1 {
    int n;
    int a;

    Game1() {
        Random r = new Random();
        this.n = r.nextInt(100);
    }

    public void takeInput() {
        System.out.println("Take input: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

    }

    public boolean isTrue() {
        if (n == a) {
            return true;
        } else if (n < a) {
            System.out.println("A is big");
        } else if (a < n) {
            System.out.println("My N is big");

        }
        return false;

    }
}

public class Game {
    public static void main(String[] args) {
        Game1 g = new Game1();
        g.takeInput();
        System.out.println(g.isTrue());

    }
}