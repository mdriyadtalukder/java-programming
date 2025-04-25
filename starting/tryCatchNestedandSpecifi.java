public class tryCatchNestedandSpecifi {
    public static void main(String[] args) {
        int[] m = new int[2];
        m[0] = 1;
        m[1] = 122;
        System.out.println(m);

        try {
            System.out.println("hi");
            try {
                m[2] = 55;
                System.out.println("hi 2");
            } catch (ArithmeticException e) {
                System.out.println("Arith");
                System.out.println(e);
               
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array");
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println(e.toString()); // e and eita same

            }

        } catch (Exception e) {
            System.out.println("End e");
            System.out.println(e);
        }
    }
}
