import java.util.*;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String sl = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            int c=0;
            for(int j=0;j<16;j++){
                c++;
                if(c<=sl.length()){
                    System.out.print(sl.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            String s=Integer.toString(n);
            if(s.length()==1){
                System.out.print("00"+n);
            }
            else if(s.length()==2){
                System.out.print("0"+n);
            }
            else{
                System.out.print(n);
            }
            System.out.println();

        }

        System.out.println("================================");
    }
}