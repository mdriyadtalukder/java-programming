import java.util.*;
public class _8_FahrenheitToCentigrade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float f,c;
        f=sc.nextFloat();
        c=(f-32)/1.8f;

        System.out.printf("%.3f",c);

    }
}
