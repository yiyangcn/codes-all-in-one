## Stack

### TripleInOne

https://leetcode-cn.com/problems/three-in-one-lcci

**方法1：两个数组**

==stackNum代表第几个栈==

思路：

- 二维数组存储每个栈的元素，一维数组记录每个栈当前有多少元素


### MinStack

https://leetcode-cn.com/problems/min-stack-lcci/

==栈可用LinkedList实现==

**方法1：辅助栈**

思路：

- 辅助栈先存放`Integer.MAX_VALUE`值，每次push都放入当前的最小值 （`Math.min()`方法）