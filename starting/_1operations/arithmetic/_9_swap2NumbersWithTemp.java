public class _9_swap2NumbersWithTemp {
    public static void main(String[] args) {
        int n1=10,n2=20,temp;

        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(temp);
    }
}
