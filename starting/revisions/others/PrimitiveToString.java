public class PrimitiveToString {
    public static void main(String[] args) {

        // String a convert
        int a = 100; // double/boolean/...all
        String s = Integer.toString(a); // Double/Boolean....
        System.out.println(s);

        // int or double

        String sl = "10";
        int i = Integer.parseInt(sl);
        //double d = Double.parseDouble(sl);
        int j = Integer.valueOf(sl);
        System.out.println(i);
        System.out.println(j);

    }

}
