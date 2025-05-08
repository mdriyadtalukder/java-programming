public class Strings {
    public static void main(String[] args) {

        // total 21 methods

        /*
         * 1.length checking
         * 2.kisu part print kora string er.
         * 3.kisu part print kora string er with indexing
         * 4. kono words ase nki string er vitor ta checking
         * 5. ki diye string suru hyse ta checking
         * 6. ki diye string sesh hyse ta checking
         * 7. 2 ta string same nki checking
         * 8. 2 ta string same nki checking with ignoring case
         * 9. string er word er index checking
         * 10. string er word er index checking with indexing
         * 11. string er ekta word er last index checking
         * 12. string er ekta word er last index checking with indexing
         * 13. 2 ta string jog kora
         * 14. ekta character er index checking
         * 15. ekta index er ascii value deoya
         * 16. empty nki check kora string ta
         * 17. lowercase e convert
         * 18. upper case e convert
         * 19. 2 pasher space rmv kora
         * 20. ekta word change kora onno word diye replace kore..
         * 21. string k array te convert with ekta chinho diye..
         * 
         */

        String s = "Amiriyad";
        String ss = "Amiriyad";
        String sss = "amiriyad";
        String t = "       am       i  riyad          ";
        String sl = new String("HelloEv");
        char[] s2 = { 'a', 'm', 'k' }; // array of string
        System.out.println(s);
        System.out.println(sl);
        System.out.println(s2);
        System.out.println(s2.length);
        System.out.println(s.length()); // length
        System.out.println(s.substring(2)); // index 2 theke last obdi print hbe
        System.out.println(s.substring(2, 5)); // index 2 theke 5-1=4 index obdi print hbe
        System.out.println(s.contains("Am")); // Am s er modde ase nki ta check kre
        System.out.println(s.startsWith("Am"));
        System.out.println(s.endsWith("dy"));
        System.out.println(s.equals(ss));
        System.out.println(s.equalsIgnoreCase(sss));
        System.out.println(s.indexOf("i")); // i er index num ber kre
        System.out.println(s.indexOf("iy", 2)); // index 2 theke i khuja suru krbe
        System.out.println(s.lastIndexOf("i")); // last i er index num ber kre
        System.out.println(s.lastIndexOf("i", 2)); // 0-2 porjnto index check kre khujbe..
        System.out.println(s.concat(ss)); // s o ss jug kre ba jura lagai..
        System.out.println(s.charAt(1)); // 1 no index er character ber kre
        System.out.println(s.codePointAt(0)); // 0 index er value er ASCII value dibe..
        System.out.println(s.isEmpty());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(t.trim()); // 2 pasher space rmv kre
        System.out.println(s.replace('i', 'j'));
        String[] k = s.split(""); // array te cnvrt kre..
        for (String i : k) {
            System.out.println(i);
        }
        String[] q = "gh,jde,kll/llle,kk".split(",");
        for (String i : q) {
            System.out.println(i);
        }

    }
}