package structure.collection.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();
        // insert
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        // remove and retrives
        deque.pollFirst();
        deque.pollLast();
        // retrives
        deque.peekFirst();
        deque.peekLast();
    }
    
}
