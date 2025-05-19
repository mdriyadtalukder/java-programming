
public class _12SortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 2, 4, 3, 99, 7, 66, 12 };
        int[] ar = { 1, 2, 3, 4, 5 };
        boolean b = true;
        for (int i = 1; i < ar.length; i++) {

            // i=1 theke suru coz i=0 hole i-1=0-1=-1 hbe ja thik na..
            if (ar[i] < ar[i - 1]) {
                b = false;
                break;
            }

        }
        System.out.println("Sorted: "+b);
    }

}
