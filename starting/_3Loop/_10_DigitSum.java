
import java.util.*;

public class _10_DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n, r;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }
        System.out.println(sum);
    }

}


/*

| Step | temp (before) | r = temp % 10 | sum (after) | temp = temp / 10 |
| ---- | ------------- | ------------- | ----------- | ---------------- |
| 1    | 1234          | 4             | 0 + 4 = 4   | 123              |  123.4 but int cut .4..so it is been 123
| 2    | 123           | 3             | 4 + 3 = 7   | 12               |
| 3    | 12            | 2             | 7 + 2 = 9   | 1                |
| 4    | 1             | 1             | 9 + 1 = 10  | 0                |



*/