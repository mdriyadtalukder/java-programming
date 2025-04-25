import java.util.*;
public class _4_TakingInput{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i;
float f;
double d;
String s;

System.out.println("Taking int input: ");
i=sc.nextInt();
sc.nextLine(); // it solves that issue of taking input of string.
System.out.println("Taking String input: ");
// s=sc.next(); just 1st word print hbe..like "md riyad"..just md print hbe;

s=sc.nextLine();
System.out.println("Taking Float input: ");
f=sc.nextFloat();
System.out.println("Taking Double input: ");
d=sc.nextDouble();

System.out.println(i);
System.out.println(f);
System.out.println(d);
System.out.println(s);



    }
}

