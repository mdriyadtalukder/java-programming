public class StringsBuilders {
    public static void main(String[] args) {

        // total 3 methods
        StringBuffer s = new StringBuffer("Ami");
        System.out.println(s.append(" Riyad"));
        System.out.println(s.append(122));
        System.out.println(s.append(134.5555));
        System.out.println(s.reverse());
        System.out.println(s.delete(0, 5)); // 5-1=4..0-4 delete krbe
    }
}
