import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {

        // 15 method total

        ArrayList<Integer> n = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();

        n.add(1);
        n.add(11);
        n.add(12);
        n.add(3, 32);

        n2.add(56);

        Collections.sort(n);
        System.out.println(n);
        Collections.sort(n, Collections.reverseOrder());
        System.out.println(n);

        System.out.println(n.equals(n2));
        System.out.println(n2.addAll(n));

        for (int i : n2) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println(n);
        System.out.println(n.size());
        System.out.println(n.remove(0));
        System.out.println(n);
        System.out.println(n.set(1, 55)); // 1 index er value replace kre 55 krbe.
        System.out.println(n);
        System.out.println(n.get(1));

        System.out.println(n.contains(11));
        System.out.println(n.indexOf(12));
        n.clear();
        System.out.println(n.size());
        System.out.println(n.isEmpty());

        System.out.println(n.removeAll(n));
        System.out.println(n.size());

    }
}