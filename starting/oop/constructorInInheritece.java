class Base {

    Base() {
        System.out.println("Hello base");
    }

    Base(int i) {
        System.out.println("Overloadingss base");
    }
}

class PBase extends Base {
    PBase() {
        // String temp=super.define_me() super.functionName dile uporer Base class er ta
        // ashbe same name er..r emni dile ei class er function ta ashbe same name er.
        super(45); // eta na dile 1st base constructor print hot..eivbei krte hy sob
        System.out.println("Hello Pbase");
    }
}

public class constructorInInheritece {
    public static void main(String[] args) {
        PBase n = new PBase();
    }
}
