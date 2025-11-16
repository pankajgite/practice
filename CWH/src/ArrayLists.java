import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(1, 6);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(12);
        // l2.addAll(l1);
        l2.addAll(0,l1);
        // l1.clear();
        l1.clone();
        System.out.println(l2.contains(1));
        System.out.println(l2.indexOf(12));
        System.out.println(l2.lastIndexOf(12));
        l2.remove(4);
        l2.set(4,5);

        for (int i = 0; i < l2.size(); i++) {
            System.out.print(l2.get(i));
            System.out.print(", ");
        }
    }
}
