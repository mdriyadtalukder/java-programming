public class covertTodecimal {
    public static void main(String[] args) {
        // binary,octal,hexadecimal to decimal
        String binary = "100110";
        Integer dec = Integer.parseInt(binary, 2); // oc-8,hex-16..
        System.out.println(dec);

        // decimal to binary,octal,hexadecimal
        int a=65;
        String st=Integer.toBinaryString(a);
        String st1=Integer.toHexString(a);
        String st2=Integer.toOctalString(a);
        System.out.println(st);
        System.out.println(st2);
        System.out.println(st1);

    }
}
