package algorithms.linkedlist;

public class KthToLast {
    public int kthToLast(ListNode head, int k) {
        // https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci
        ListNode node = new ListNode(0);
        int result = 0;
        node = head;
        int len = 1;
        // 当只有一个的时候
        while (head.next == null) {
            return head.val;
        }
        // 先遍历一遍计算链表长度
        while (head.next != null) {
            len++;
            head = head.next;
        }

        int count = 1;
        while (node !=null) {
            if ((len - k + 1) == count) {
                result = node.val;
                break;
            } else {
                node = node.next;
                count++;
            }
        }
        return result;
    }
}
