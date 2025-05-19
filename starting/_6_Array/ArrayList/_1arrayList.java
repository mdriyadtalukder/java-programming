import java.util.*;

public class _1arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<String> st = new ArrayList<String>();

        // total 17

        /*
         * 1. adding
         * 2. adding with index num
         * 3.add all elem to another arrayList
         * 4. iterator
         * 5. each loop
         * 6.value modify
         * 7.getting value
         * 8.length check
         * 9. remove with a index.
         * 10. remove all
         * 11. sob value clear kra.
         * 12. empty nki ta check
         * 13. kono value ase nki ta check kora..
         * 14. ekta elem er index check
         * 15.sort kora
         * 16. sort ta reverse kora
         * 17. equal check kora
         * 
         */

        // adding
        st.add("keya");
        st.add(1, "riya");

        ar.add(1); // adding
        ar.add(111);
        ar.add(122);
        ar.add(3, 455); // 3 no index e 455 add hbe..

        a2.add(6788);
        System.out.println(ar.addAll(a2)); // a2 er sob ar te add hbe

        Iterator iar = ar.iterator(); // iar te ar er values add holo

        while (iar.hasNext()) { // jotokkhn porjonto empty na hbe arraylist totokkhn porjonto print hotei thkbe.
            System.out.println(iar.next());

        }

        for (int i : ar) {
            System.out.println(i);
        }

        // sorting
        Collections.sort(ar); // sort kre
        System.out.println(ar);
        Collections.sort(ar, Collections.reverseOrder()); // sort gula reverse kre

        System.out.println(ar.size()); // length ba size bole
        System.out.println(ar.equals(st)); // equal nki check kre
        System.out.println(ar.get(1)); // 1 no index er value dibe
        System.out.println(ar.remove(2)); // 2 no index er value remove krbe
        System.out.println(ar.set(0, 34321)); // 0 no index er value replace hoye 34321 hbe..
        System.out.println(a2.contains(6788)); // 6788 ase nki a2 te ta check krbe
        System.out.println(a2.indexOf(6788)); // index check krbe 6788 value er
        System.out.println(a2.isEmpty()); // empty nki check krbe
        System.out.println(a2.removeAll(a2)); // sob remove krbe
        st.clear();// sob rmv kre clear krbe..
    }

}
