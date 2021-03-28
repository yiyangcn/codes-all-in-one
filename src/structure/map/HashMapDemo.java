package structure.map;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

/**
 * 
 * sorted by key
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(0, 6);
        map.put(4, 4);
        map.put(2, 1);
        map.get(1);
        Set<Integer> keysSet = map.keySet();
        for (Integer i : keysSet) {
            System.out.println(map.get(i));
        }
    }
}
