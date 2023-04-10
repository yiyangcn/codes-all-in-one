package algorithms.linkedlist;


public class AddTwoNumber {
    // https://leetcode-cn.com/problems/sum-lists-lcci/
    // 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 原地相加

        ListNode head = new ListNode(0);
        ListNode dummy = new ListNode(0);
        head = dummy;
        int extra = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + extra;
            if (temp < 10) {
                ListNode node1 = new ListNode(temp);
                dummy.next = node1;
                dummy = dummy.next;
                extra = 0;
            } else {
                ListNode node2 = new ListNode(temp % 10);
                dummy.next = node2;
                dummy = dummy.next;
                extra = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
       // 三种情况
        if (l1 != null) {
            addDiffLength(l1, dummy, extra);
        } else if (l2 != null) {
            addDiffLength(l2, dummy, extra);
        } else {
            if (extra > 0) {
                dummy.next = new ListNode(extra);
            }
        }
        return head.next;
   }

    static void addDiffLength(ListNode l, ListNode dummy, int extra) {
        while (l != null) {
            int temp = l.val + extra;
            if (temp < 10) {
                ListNode node1 = new ListNode(temp);
                dummy.next = node1;
                dummy = dummy.next;
                extra = 0;
            } else {
                ListNode node2 = new ListNode(temp % 10);
                dummy.next = node2;
                dummy = dummy.next;
                extra = 1;
            }
            l = l.next;
       }
        if (extra > 0) {
            ListNode node = new ListNode(extra);
            dummy.next = node;
            dummy = dummy.next;
        }
   }
}
