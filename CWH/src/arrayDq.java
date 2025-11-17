
import java.util.ArrayDeque;

public class arrayDq {
    public static void main(String[] args) {
        ArrayDeque<Integer> q1= new ArrayDeque<>();
        q1.add(23);
        q1.add(21);
        q1.add(22);
        q1.addFirst(20);
        System.out.println(q1.getFirst());
        System.out.println(q1.getLast());
    }
}
