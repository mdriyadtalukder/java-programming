class Phone {
    public void On() {
        System.out.println("On phone");
    }

    public void hu() {
        System.out.println("hu");
    }
}

class SmartPhone extends Phone {
    public void On() {
        System.out.println("On SmartPhoe");
    }

    public void hi() {
        System.out.println("hi");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.On();
        p.hu();
       // p.hi(); // phone er sob run hbe coz reference e Phone ase but method overloading hole object er ta run hbe..er mane smartphone er ta run hbe..
    }
}
