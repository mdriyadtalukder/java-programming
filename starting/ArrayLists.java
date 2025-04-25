import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> arrl = new ArrayList<Integer>();
        arrl.add(10);
        arrl.add(102);
        arrl.add(103);
        arrl.add(3, 222);
        Iterator it = arrl.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println(arrl);

        for (int i : arrl) {
            System.out.println(i);
        }
        arrl.remove(1);
        System.out.println(arrl);
        System.out.println(arrl.size());
        arrl.removeAll(arrl);
        System.out.println(arrl);


    }
}
