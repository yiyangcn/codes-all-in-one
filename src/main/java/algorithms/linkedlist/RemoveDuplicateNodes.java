package algorithms.linkedlist;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodes {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
    }
    
    public ListNode removeDuplicateNodes(ListNode head) {
        // https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
        ListNode dummy = new ListNode(0);
        ListNode result = new ListNode(0);
        dummy.next = head;
        result = dummy;
        // 使用set存储节点 
        Set<Integer> set = new HashSet<Integer>();
        if (head == null ) {
            return head;
        }
        while (head.next != null) {
            if (!set.contains(head.val)) {
                // 当节点不包含,不改动head 1 2 3 3 4 1
                set.add(head.val);
                head = head.next;
                dummy = dummy.next;
            } else {
                // 当节点已存在，跳过这个重复节点
                dummy.next = head.next;
                head = head.next;
            }
        }
        // 处理最后一个节点
        if (set.contains(dummy.next.val)) {
            dummy.next = null;
        }

        return result.next;
    }
}
