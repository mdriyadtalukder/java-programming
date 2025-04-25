class Male {
    private int age;
    private String name;

    public void setAge(int n) {
        age = n;
    }

    public int getAge() {
        return age;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }
}

public class getterSetter {

    public static void main(String[] args) {
        Male roni =new Male();
        // roni.age=12;
        roni.setAge(19);
        roni.setName("Roni Khan");
        System.out.println(roni.getName());
        System.out.println(roni.getAge());


    }
}
