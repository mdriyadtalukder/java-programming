
class NegativeException extends Exception {

    // public NegativeException(String message) {
    // super(message);
    // }
    public String getMessage() {
        return "Redius cannot be zero";
    }

    public String toString() {
        return "Redius cannot be zero";
    }
}

public class throwTheows {

    static int red(int r) throws NegativeException { // eitar error gula NegativeException type er hbe..
        if (r <= 0) {
            // throw new NegativeException("jkkk"); eta likhle just super(message) eitar
            // function likhbo.getMessage,toString drkr nei;
            throw new NegativeException();
        }
        return r * r;

    }

    static double div(int a, int b) throws ArithmeticException { // eitar error gula ArithmeticException type er hbe..
        double d = a / b;
        return d;

    }

    public static void main(String[] args) {
        try {
            // System.out.println(div(4, 0));
            System.out.println(red(-8));

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("end of program"); // eta all time run hbe..error holeo ba correctly execute holeo
        }
    }
}
