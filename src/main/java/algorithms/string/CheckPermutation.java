package algorithms.string;
import java.util.HashMap;
import java.util.Set;

public class CheckPermutation {

    static public boolean checkPermutation(String s1, String s2) {
        // 能重排说明字符都相等 只是 顺序有可能不同 长度相同
        // 思路1：排序后判断是否相等
        // 思路2：hashmap 计数
        // leetcode: https://leetcode-cn.com/problems/check-permutation-lcci
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i< len1; i++) {
            char key1 = s1.charAt(i);
            char key2 = s2.charAt(i);
            if (map1.containsKey(key1)) {
                map1.put(key1, map1.get(key1)+1);
            } else {
                map1.put(key1, 0);
            }
            if (map2.containsKey(key2)) {
                map2.put(key2, map2.get(key2)+1);
            } else {
                map2.put(key2, 0);
            }
        }
        Set<Character> keysSet = map1.keySet();
        for (char key : keysSet) {
            if (map2.containsKey(key) && (map1.get(key)==map2.get(key))) {
                
            } else {
                return false;
            }
        }
        return true;
    
    }
}
