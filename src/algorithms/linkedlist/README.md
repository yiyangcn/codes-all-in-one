## LinkedList

### RemoveDuplicateNodes.java

https://leetcode-cn.com/problems/remove-duplicate-node-lcci/

**方法1：dummy node**

思路：

1. 新建一个dummy node指向链表头节点
2. 新建一个set存储不重复的节点
3. 当set不包含重复节点时，继续往下遍历链表
4. 当set包含重复节点时，dummy node的下个节点跳过当前节点
5. 遍历结束后处理dummy的最后一个节点。

### KthToLast.java

https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci

**方法1：二次遍历**

思路：

1. 第一次遍历计算链表的长度
2. 通过计算的长度判断当前处于倒数第几个节点，当处于第k个节点时返回当前节点的值

### **DeleteNode.java**

https://leetcode-cn.com/problems/delete-middle-node-lcci/

==注意审题==

思路：

1. 先将Node的下个节点的值赋值给要删除的节点
2. 然后将node的下个节点指向下下个节点

### Partition.java

https://leetcode-cn.com/problems/partition-list-lcci/

**方法1：维护两个链表**

思路：

1. 只需维护两个链表 small 和 large 即可，small 链表按顺序存储所有小于 x 的节点，large 链表按顺序存储所有大于等于 x 的节点。遍历完原链表后，我们只要将 small 链表尾节点指向 large 链表的头节点即能完成对链表的分割

   作者：LeetCode-Solution
   链接：https://leetcode-cn.com/problems/partition-list-lcci/solution/fen-ge-lian-biao-by-leetcode-solution-iohj/
   