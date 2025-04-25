
interface car{
    void ring();
}
interface bus{
    void red();
}
class alls implements car,bus{
    public void ring(){
        System.out.println("ringddd");
    }
    public void red(){
        System.out.println("lighting");
    }
}
public class polymorphisms {
    public static void main(String[] args) {
        car c=new alls();
        bus b=new alls();
        c.ring();
       // c.red(); error hbe..jar jar function se just call krte parbe..
        b.red();
       // b.ring(); error hbe
        
    }
}
