import java.util.*;
public class _11_quadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,x1,x2;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=Math.sqrt(b*b-4*a*c);
        x1=(-b+d)/(2*a);
        x2=(-b-d)/(2*a);
        System.out.println(x1);
        System.out.println(x2);
        
    }
}
