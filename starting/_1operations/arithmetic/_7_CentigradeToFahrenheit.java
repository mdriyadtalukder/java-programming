import java.util.Scanner;

public class _7_CentigradeToFahrenheit {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    float f,c;
    c=sc.nextFloat();
    f=(c*1.8f)+32;
    System.out.printf("%.2f",f);
 }
    
}