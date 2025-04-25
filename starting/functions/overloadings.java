public class overloadings {
    static void foo(){
        System.out.println("Foo");
    }
    static void foo(int a){
        System.out.println("Foo");
    }
    static void foo(int a,char b){
        System.out.println("Foo");
    }
    public static void main(String[] args){
        foo();
        foo(2);
        foo(2,'k');

    }
}
