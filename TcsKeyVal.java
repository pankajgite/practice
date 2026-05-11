import java.util.*;

class Pair {
    String key;
    int value;

    Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class TcsKeyVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 1000) {
            System.out.println("Length is high");
            return;
        }

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            list.add(new Pair(key, value));
        }

        // Sorting logic
        Collections.sort(list, (a, b) -> {
            if (a.value != b.value) {
                return a.value - b.value; // sort by value
            } else {
                return a.key.compareTo(b.key); // sort by key
            }
        });

        // Print result
        for (Pair p : list) {
            System.out.println(p.key + " " + p.value);
        }
    }
}