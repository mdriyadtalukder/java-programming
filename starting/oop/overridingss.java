class A {
    public void math() {
        System.out.println("I am from a");
    }
}

class B extends A {
    public void math() { //same type same parameter and same access modifier hote hbe..
        System.out.println("I am from b");
    }
}

public class overridingss {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.math();
        b.math(); // jar jar ta se se print krbe

    }
}
