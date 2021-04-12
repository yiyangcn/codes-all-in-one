## Array

### Rotate.java

https://leetcode-cn.com/problems/rotate-matrix-lcci

*改题默认 m=n , 后续应考虑 m！=n 的解法*

**方法1：辅助数组二次遍历**

思路：

1. 第一次遍历将输入的matrix的值从下往上从左往右赋值给新的数组
2. 第二次遍历改变matrix的值

### SetZeroes.java

https://leetcode-cn.com/problems/zero-matrix-lcci/

**方法1：二次遍历**

思路:

1. 第一次遍历矩阵，记录0所在的矩阵坐标
2. 第二次遍历坐标，将相对应的行与列赋值为0


