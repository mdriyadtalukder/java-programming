public class MulOdd {
    public static void main(String[] args) {
        int n = 10, odd = 1;
        for(int i=2;i<=n;i=i+2){
            odd=odd*i;
        }
        System.out.println(odd);
    }
}
