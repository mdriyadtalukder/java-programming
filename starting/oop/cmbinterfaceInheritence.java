interface one{
    void helli();
    private void v(){
        System.out.println("Im private");
    }
    default void df(){
        v();
        System.out.println("Im default");
    }
}
interface two{
    void it();
}

class ihcl{
    public void intr(){
        System.out.println("im class");
    }
}

class mains extends ihcl implements one,two{
    public void helli(){
        System.out.println("hell");
    }
    public void it(){
        System.out.println("iit");
    }
    public void df(){
        System.out.println("df"); //eita na likhte deafult ta run hoto..but ekhn eta run hbe.. eta na thkle defaut ta run hoto and tar vitorer private tao run hoyo
    }
}

public class cmbinterfaceInheritence {
    public static void main(String[] args) {
        mains m=new mains();
        m.df();
        
    }
}
