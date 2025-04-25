public class FunctionMethod {
    static float sum(int a, float b) {
        float r = a + b;
        return r;
    }

    int st() {
        return 1 + 3;
    }

    static void name() {
        System.out.println("My name is riyad");
    }

    static void line(String a) { // void hbe jdi kono value return na kri..
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        float f = 6.786f;
        FunctionMethod obj = new FunctionMethod();
        int s = obj.st();
        float result = sum(a, f); // a and f er copy gese function e..oikhn theke er value change krleo ta change
                                  // hbe na ..
        System.out.println(result);
        System.out.println(s);
        name();
        line("Who are you?");
    }
}