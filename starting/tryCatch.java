public class tryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
        System.out.println("Finished");
    }
}
