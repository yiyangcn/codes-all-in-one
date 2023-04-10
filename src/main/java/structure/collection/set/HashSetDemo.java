package structure.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * base main.java.structure is hashtable
 * 
 * inorder and unique, no duplicate
 * how to make sure unique ele? hashCode() and equals()
 */
public class HashSetDemo {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("e");
        set.add("d");
        set.add("c");
        set.add("e");
        set.add("a");
        System.out.println(set);
        set.remove("e");
        System.out.println(set.contains("c"));
        Iterator<String> iterable = set.iterator();
        while (iterable.hasNext()){
            String element = iterable.next();
            System.out.println(element);
        }
    }
}
