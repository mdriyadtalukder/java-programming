
class Female {
    int a;
    String s;

    public Female() {
        a = 18;
        s = "Riyad";
    }

    public Female(int i, String st) {
        a = i;
        s = st;
    }

    public void setAge(int age) {
        this.a = age;
    }

    public int getAge() {
        return this.a;
    }

    public String getName() {
        return this.s;
    }
}

public class constructorss {
    public static void main(String[] args) {
        // Female rani = new Female();
        Female rani = new Female(34, "Keya");
        // rani.setAge(13);
        System.out.print(rani.getAge());
        System.out.print(rani.getName());

    }
}
