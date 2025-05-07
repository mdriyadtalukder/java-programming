
public class _10_AtringleCol {
    public static void main(String[] args) {
        int[][] arr = new int[4][];// col er value blbona;

        arr[0] = new int[1];// 1 no row e 1 ta col thkbe
        arr[1] = new int[2];// 2 no row e 2 ta col thkbe
        arr[2] = new int[3];// 3 no row e 3 ta col thkbe
        arr[3] = new int[4];// 4 no row e 4 ta col thkbe
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
