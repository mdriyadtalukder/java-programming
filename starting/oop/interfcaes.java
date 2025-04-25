
interface car {
    int a = 56;

    public void rings();

    public void ming();
}

interface car2 {
    //int a = 111; error hbe..2 interface e ek nam thaka jbe na

    void jkl();

    public void jh();
}

class both implements car, car2 {
    public void rings() {
        System.out.println("ringingg");
    }

    public void ming() {
        System.out.println("mingingg");
    }

    public void jkl() {
        System.out.println("jkkk");
    }

    public void jh() {
        System.out.println("jh");
    }

}

public class interfcaes {
    public static void main(String[] args) {
        both b=new both();
        b.rings();
        System.err.println(b.a);

    }
}
