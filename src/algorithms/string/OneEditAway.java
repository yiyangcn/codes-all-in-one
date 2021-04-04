package algorithms.string;


public class OneEditAway {

    public boolean oneEditAway(String first, String second) {
        // 插入 删除 替换 
        // 插入和删除类似：一边更短一个字符，可以删一边，可以插一边
        // 替换，一样长
        // https://leetcode-cn.com/problems/one-away-lcci

        int firstLen = first.length();
        int secondLen = second.length();
        int count = 0;
        String longer = firstLen >= secondLen ? first : second;
        String shoter = firstLen <= secondLen ? first : second;
        // 相减大于等于长度二 直接返回false
        if (firstLen - secondLen >=2  || secondLen - firstLen >= 2)
            return false;

        // 一样长的情况
        if (firstLen == secondLen) {
            for (int i = 0; i < firstLen; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                }
            }
        }
        if (count > 1) {
            return false;
        }
        // 不一样长的情况
        int j = 0;
        int diffCount = 0;
        if (firstLen != secondLen) {
            for (int i = 0; i < shoter.length(); i++) {
                if (longer.charAt(j) != shoter.charAt(i)) {
                    j++;
                    i--;
                    diffCount++;
                } else {
                    j++;
                }
                if (diffCount > 1) {
                    return false;
                }
            }
        }
  
        return true;
    }
}