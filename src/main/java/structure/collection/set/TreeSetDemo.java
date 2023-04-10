package structure.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * sorted set
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(0);
        set.add(5);
        set.add(3);
        set.add(3);
        System.out.println(set);

    }
}
