class onee extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am one");
            i++;

        }
    }

}

class twoo extends Thread {
    
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am two");
            i++;

        }
    }

}

public class threads {
    public static void main(String[] args) {
        onee a = new onee();
        twoo b = new twoo();
        a.start();
        b.start();

    }
}