import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand=new Random();

        int r=rand.nextInt(91)+10; //0-4 dibe..jdi 0 na chay tahole 1 + krte pari.. 91)+10.so eia 10-100 dibe..90+1 disi karon 0 theke count suru hy..
        int m=(int)(Math.random()*10)+1;//0-9 dibe total 10 ta..ami 1 + krsi jate 1 theke count hy..
        System.out.println(r);
        System.out.println(m);
        
    }
}
