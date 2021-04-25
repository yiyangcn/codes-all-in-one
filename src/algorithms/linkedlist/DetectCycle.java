package algorithms.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        // https://leetcode-cn.com/problems/linked-list-cycle-lcci
        ListNode temp = head;
        Set<ListNode> visitedNodes = new HashSet<ListNode>();
        while (temp != null) {
            if (visitedNodes.contains(temp)) {
                return temp;
            } else {
                visitedNodes.add(temp);
            }
            temp = temp.next;
        }
        return null;

    }
    
}
