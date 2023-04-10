package algorithms.linkedlist;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        // node 是要删除的节点
        // https://leetcode-cn.com/problems/delete-middle-node-lcci/
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
}
