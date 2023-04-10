package structure.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList implements List
 * 
 * Base data main.java.structure is array,
 * search quickly but delete/add elements at specified 
 * position slowly
 * 
 * Thread insecurity, efficiently
 */
public class ArrayListDemo{
    
    
    
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        // adds element to the end of the list
        list1.add("a");
        list2.add("b");
        list2.add("c");
        System.out.println(list1);
        // adds all elements in the collection to the end of list
        list1.addAll(list2);
        System.out.println(list1);
        list1.addAll(0,list2);
        list1.contains("a");
        System.out.println(list1);
        //  returns a element at the specified position in the list
        String ele = list1.get(2);
        System.out.println(ele);
        // returns sublist
        System.out.println(list1.subList(0, 1));
        // replaces the element at the position in the list
        list1.set(0, "g");
        System.out.println(list1);
        // removes the element at the specified position in this list
        list1.remove(3);
        System.out.println(list1);
        // removes first specified element from the list
        list1.remove("a");
        System.out.println(list1);
        // remove all elements in the list2
        list1.removeAll(list2);
        System.out.println(list1);
        // retains all elements in a list
        list1.retainAll(list2);
        System.out.println(list1);
        // return size
        list1.size();
         // removes all elements from this list
        list1.clear();


    }
}
