public class StringsBuilders {
    public static void main(String[] args) {

        // total 10 methods

        /*
         * 1.add
         * 2.remove
         * 3.reverse
         * 4.setCharAt
         * 5. insert
         * 6. delete at
         * 7.substring..9.with 2 index
         * 8.indexof..10.with 2 index
         */
        StringBuilder s = new StringBuilder("Ami");
        System.out.println(s.append(" Riyad"));
        s.setCharAt(0, 't');
        System.out.println(s.append(122));
        System.out.println(s.append(134.5555));
        System.out.println(s.reverse());
        System.out.println(s.delete(0, 5)); // 5-1=4..0-4 delete krbe

        StringBuilder m = new StringBuilder("tmi");
        System.out.println(m.insert(1, 'u')); // 1 er ta 2 hbe and 1 e new char dibe..not replace..
        m.deleteCharAt(1);
        System.out.println(m);

    }
}
