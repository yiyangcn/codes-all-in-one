package algorithms.string;

import java.util.HashMap;
import java.util.Set;

public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        // 哈希表计数 偶数个字符 并且最多只有一个是奇数 则是回文排列
        // https://leetcode-cn.com/problems/palindrome-permutation-lcci
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) % 2 == 1) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        } else {
            return true;
        }
    }
    
}
