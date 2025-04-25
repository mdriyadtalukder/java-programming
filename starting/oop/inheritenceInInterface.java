interface maths {
    void math();
}

interface mathss extends maths {
    void math2();
}

class allm implements mathss {
    public void math() {
        System.out.println("Math");
    }

    public void math2() {
        System.out.println("Math2");
    }
}

public class inheritenceInInterface {
    public static void main(String[] args) {
        allm m = new allm();
        m.math();
        m.math2();

    }
}
