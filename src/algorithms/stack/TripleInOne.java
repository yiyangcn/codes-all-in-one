package algorithms.stack;


public class TripleInOne {
    // https://leetcode-cn.com/problems/three-in-one-lcci
    private int[][] array = new int[3][1];
    // 记录每个栈当前有多少元素
    private int[] count = {0, 0, 0};
    private int stackSize = 0;
    public TripleInOne(int stackSize) {
        this.array = new int[3][stackSize];
        this.stackSize = stackSize;
    }
    
    public void push(int stackNum, int value) {
        if (count[stackNum] != this.stackSize) {
            this.array[stackNum][count[stackNum]] = value;
            count[stackNum] = count[stackNum] + 1;
        }
       
    }
    
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            return -1;
        } else {
            count[stackNum] = count[stackNum] - 1;
            int temp = this.array[stackNum][count[stackNum]];
            return temp;
        }
    }
    
    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            return -1;
        } else {
            count[stackNum] = count[stackNum] - 1;
            int temp = this.array[stackNum][count[stackNum]];
            count[stackNum] = count[stackNum] + 1;
            return temp;
        }
    }
    
    public boolean isEmpty(int stackNum) {
        if (count[stackNum] == 0) {
            return true;
        } else {
            return false;
        }
    }  
}

