package algorithms.string;

public class ReplaceSpaces {
    public String replaceSpaces(String S, int length) {
        // 从前往后用字符串相加会超过时间限制 
        // S的长度有可能超过 替换空格后的数组的长度 从后往前麻烦
        // https://leetcode-cn.com/problems/string-to-url-lcci
        char [] charArray = new char[S.length()];
        int pointer = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                charArray[pointer] = '%';
                charArray[pointer+1] = '2';
                charArray[pointer+2] = '0';
                pointer += 3;
            } else {
                charArray[pointer] = S.charAt(i);
                pointer += 1;
            }
        }
    
        String res = new String(charArray, 0, pointer);
        return res;
    }

}
