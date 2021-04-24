package algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        // https://leetcode-cn.com/problems/palindrome-linked-list-lcci
        List<Integer> list = new ArrayList<Integer>(); 
        while (head!=null) {
            list.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = list.size() - 1;

        while (end - start >= 1) {
            if (list.get(start).equals(list.get(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
