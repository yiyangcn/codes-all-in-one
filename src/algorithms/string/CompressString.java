package algorithms.string;

public class CompressString {
    
    public String compressString(String S) {
        // 双指针 fisrtIndex 
        // 不同时 fisrtIndex = secondIndex
        // https://leetcode-cn.com/problems/compress-string-lcci
        int firstIndex = 0;
        int secondIndex = 1;
        int len = S.length();
        int count = 1;
        String res = "";
        if (len == 1 || len == 0) {
            return S;
        }

        while (firstIndex < len ) {
            if (secondIndex == len ) {
                res = res + S.charAt(firstIndex) + String.valueOf(count);
                break;
            } 
            if (S.charAt(firstIndex) == S.charAt(secondIndex)) {
                count++;
                secondIndex++;
            } else {
                res = res + S.charAt(firstIndex) + String.valueOf(count);
                count = 1;
                firstIndex = secondIndex;
                secondIndex++;
            }
        }

        return len > res.length() ? res : S;
    }
}