public class Strings {
    public static void main(String[] args) {

        // total 17 methods
        String s = "Amiriyad";
        String ss = "Amiriyad";
        String sss = "amiriyad";
        String t = "       am       i  riyad          ";
        String sl = new String("HelloEv");
        char[] s2 = { 'a', 'm', 'k' };
        System.out.println(s);
        System.out.println(sl);
        System.out.println(s2);
        System.out.println(s.length());
        System.out.println(s.contains("Am"));
        System.out.println(s.startsWith("Am"));
        System.out.println(s.endsWith("dy"));
        System.out.println(s.equals(ss));
        System.out.println(s.equalsIgnoreCase(sss));
        System.out.println(s.indexOf("i"));
        System.out.println(s.lastIndexOf("i"));
        System.out.println(s.concat(ss));
        System.out.println(s.charAt(1));
        System.out.println(s.codePointAt(0)); // 0 index er value er ASCII value dibe..
        System.out.println(s.isEmpty());
        System.out.println(s.toLowerCase());
        System.out.println(s.toLowerCase());
        System.out.println(t.trim());
        System.out.println(s.replace('i', 'j'));
        String[] k = s.split("");
        for (String i : k) {
            System.out.println(i);
        }

    }
}