public class _7_oddEvenSum {
    public static void main(String[] args) {
        // 1-2+3-4+5-6....
        // sum=(1+3+5+...)-(2+4+6...)
        int odd = 0, even = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd = odd + i;
            }
        }
        System.out.println(odd - even);
    }
}
