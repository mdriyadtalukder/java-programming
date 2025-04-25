class Mina {
    int x;

    public void setX(int a) {
        System.out.println("i am mina");
        this.x = a;
    }

    public int getX() {
        return this.x;
    }

    public void getSt() {
        System.out.println("Hello mina");
    }
}

class GradM extends Mina {
    int y;

    public void setY(int a) {
        this.y = a;
    }

    public int getY() {
        return this.y;
    }
}

public class inheritences {
    public static void main(String[] args) {
        //Mina m=new Mina();
        GradM m=new GradM();
        m.setX(67);
        System.out.println(m.getX());

    }
}
