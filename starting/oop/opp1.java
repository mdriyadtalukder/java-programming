class Employee {
    int age, salary;
    String name;

    public void getDetails() {
        System.out.println("My name is " + name + ".and my age is " + age);
    }

    public int getSalary() {
        return salary;
    }
    public void setName(String n){
        name=n;

    }
}
class Phone{
    public void getRing(){
        System.out.println("Ringing...");
    }
}
public class opp1 {
    public static void main(String[] args) {
        Employee emply = new Employee();
        Employee raja = new Employee();
        Phone asus=new Phone();
        emply.age = 17;
        emply.salary = 20000;
        asus.getRing();
        emply.setName("Talukder");
        // emply.name = "Riyad";
        emply.getDetails();
        System.out.println(emply.getSalary());

        raja.age = 25;
        raja.name = "RAJA";
        raja.getDetails();

    }
}