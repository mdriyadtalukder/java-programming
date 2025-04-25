public class _3_FormatSpecifier {
    public static void main(String[] args){
        byte b=3;
        short s=456;
        int i=3444;
        long l=778883L;

        float f=5.667F;
        double d=6556.666d;

        char c='y';
        boolean bo=true;

        System.out.printf("byte: %d",b);
        System.out.printf("short: %d",s);
        System.out.printf("int: %d",i);
        System.out.printf("long: %d",l);

        System.out.printf("float: %f\n",f);
        System.out.printf("double: %.2f",d); //doshomik er por 2 ghor dekhabe

        System.out.printf("char: %c\n",c);
        System.out.printf("boolean: %b",bo);
    }
}
