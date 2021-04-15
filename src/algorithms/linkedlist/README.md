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