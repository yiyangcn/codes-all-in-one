## 字符串常用函数

> **length()**
>
> returns length of the character
>
> **charAt(int index)**
>
> returns the character at the specified index
>
> **indexOf(String ch)**
>
> Returns the index within this string of the first occurrence of the specified substring. return -1 if not exits.
>
> **indexOf(String ch, int fromIndex)**
> Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

### CheckIsUnique.java

https://leetcode-cn.com/problems/is-unique-lcci/

**方法1：使用额外的数据结构**

思路：

1. 使用额外的数据结构 （set，list，array等）
2. 循环遍历每个字符
3. 将唯一的字符加入额外数据结构 
4. 当遇到重复字符则返回false，否则返回true

**方法2：位运算**

略

**方法3：indexOf**

思路：

1. 遍历每一个字符
2. 如果从当前字符的下一个坐标开始包含当前字符，说明有重复
3. ps 边界条件，数组越界