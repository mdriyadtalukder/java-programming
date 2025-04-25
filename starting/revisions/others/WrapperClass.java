public class WrapperClass {
    public static void main(String[] args) {

        //primitive to object
        int a = 6;
        Integer b = Integer.valueOf(a); //6
        Integer c = a;
        System.out.println(b);
        System.out.println(c);

        //object to primitive.
        Integer i=89;
        int t=i.intValue();
        System.out.println(t);
    }
}