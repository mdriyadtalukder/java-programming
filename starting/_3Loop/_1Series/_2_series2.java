import java.util.*;

public class _2_series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 numbers: ");
        int n = sc.nextInt(), n2 = sc.nextInt(), a = 1, b = 2, sum = 0;
        System.out.print("1*2 + 2*3 + 3*4 +.....+ " + n + "*" + n2 + " = ");
        while (a <= n && b <= n2) { // n o n2 ..a o b er cheye boro ba shoman hole cholbe...
            sum = sum + a * b;
            a++;
            b++;
        }
        System.out.print(sum);
    }

}
