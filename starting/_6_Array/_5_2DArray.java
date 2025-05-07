
public class _5_2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[1][2]; // r*c..1*2=2;
        arr[0][0] = 1;
        arr[0][1] = 11;
        System.out.println(arr.length);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        for (int r = 0; r < 1; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.println(arr[r][c]);
            }
        }
    }
}
