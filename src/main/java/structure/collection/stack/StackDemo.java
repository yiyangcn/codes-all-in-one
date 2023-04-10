package structure.collection.stack;

import java.util.Stack;

/**
 * extends Vector
 * 
 * 
 */
public class StackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();

        stack.isEmpty();
        // add ele at the end
        stack.push(1);
        stack.push(2);
        // get ele at the end but not remove       
        stack.peek();
        // retrives and remove ele at the end
        stack.pop();
        String a = "9999999991";
        System.out.println(Long.valueOf(a));
        
    }
    
}
