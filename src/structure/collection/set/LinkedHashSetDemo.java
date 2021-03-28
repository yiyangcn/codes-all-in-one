package structure.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * remember the order in which elements were inserted
 * 
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
    
}
