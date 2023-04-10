package structure.collection.queue;


import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        

        // insert ele to queue
        queue1.offer(1);
        queue1.offer(2);
        System.out.println(queue1);
        // retrieves and removes the head ele
        queue1.poll();
        System.out.println(queue1);
        // retrieves but not removes the head ele can returns null
        queue1.peek();
        System.out.println(queue1);
        // retrieves but not removes the head ele
        queue1.element();
        
    }
}
