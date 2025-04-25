import java.util.*;

public class _14_Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,sum=0,temp=n;

        while (temp!=0) {
            r=temp%10;
            sum=(int) (sum+Math.pow(r, 3));
            temp=temp/10;
            
        }
        if(sum==n){
            System.out.println("Armstrong ");
        }
        else{
            System.out.println("Not Armstrong ");
        }
    }

}
