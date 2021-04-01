### 字符串常用函数

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

### Map常用函数

> containsKey(Object o)

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

### CheckPermutation.java

https://leetcode-cn.com/problems/check-permutation-lcci

**方法1：排序后判断是否相等**

略

**方法2：两个HashMap计数** 

思路：

1. 第一次遍历以字符为key，字符出现的次数为value。分别将两个字符串存至两个map中

2. 第二次遍历判断，同时满足以下条件可继续循环否则返回false：

   1. map2包含map1中的key
   2. 所包含的key的值相等

### ReplaceSpaces.java

 https://leetcode-cn.com/problems/string-to-url-lcci

**方法1：用API解题**

略

**方法2：从前往后遍历，双指针**

思路：

1. 一个指针用来遍历字符串，另一个指针控制新建字符数组的下标，
2. 从前往后遍历，当为空格时，将`20%`赋值给字符数组，下标增加3，否者将当前字符赋值给字符数组，下标增加1

`用同样的思路，通过字符串不断累加会超过时间限制，不知道为啥`

### CanPermutePalindrome.java

https://leetcode-cn.com/problems/palindrome-permutation-lcci

**方法1：哈希表计数**

思路：

1. 哈希表计数 相同时计数加一
2. 最多只有一个是奇数 则是回文排列