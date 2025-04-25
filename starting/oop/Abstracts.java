abstract class Mam {
    public void he() {
        System.out.println("he");
    }

    abstract public void greet();
}

class Keya extends Mam {
    void hi() {
        System.out.println("jk");
    }

    public void greet() {
        System.out.println('l');
    }
}

abstract class Naya extends Mam { // abstract likhte hbe na hoy parent er abstact method implement krte hbe..
    public void hl() {
        System.out.println("hj");
    }
}

public class Abstracts {
    public static void main(String[] args) {
        // Mam man = new Mam();// implement krte hbe abstract method..na hy error hbe
        Keya man2 = new Keya();
        // Naya man3 = new Naya();//implement krte hbe abstract method..na hy error hbe

    }
}
