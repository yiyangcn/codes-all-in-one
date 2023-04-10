package algorithms.stack;
import java.util.ArrayList;

class MinStack {

    /** initialize your data main.java.structure here. */
    // https://leetcode-cn.com/problems/min-stack-lcci/
    // 存放最小值
    ArrayList<Integer> minStack;
    ArrayList<Integer> stack;
    public MinStack() {
        minStack = new ArrayList<Integer>();
        stack = new ArrayList<Integer>();
        minStack.add(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        stack.add(x);
        minStack.add(Math.min(minStack.get(minStack.size() - 1), x ));
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}