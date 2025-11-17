import java.util.LinkedList;

public class Linkedlist01 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
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
