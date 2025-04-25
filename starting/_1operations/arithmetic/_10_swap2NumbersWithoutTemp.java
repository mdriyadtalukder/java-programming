public class _10_swap2NumbersWithoutTemp {
    public static void main(String[] args) {
       int num=7,num2=3;

       num=num-num2;
       num2=num+num2;
       num=num2-num;

       System.out.println(num);
       System.out.println(num2);
    }
}
