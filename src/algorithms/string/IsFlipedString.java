package algorithms.string;

public class IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        // leapp   apple 
        // https://leetcode-cn.com/problems/string-rotation-lcci/
        int s1Len = s1.length();
        int s2Len = s2.length();

        if (s1Len != s2Len) {
            return false;
        }
        if (s1Len == 0 || s2Len == 0){
            return true;
        }

        for (int i = 1; i <= s1Len; i++) {
            if ((s1.substring(0,i)).equals(s2.substring(s2Len-i,s2Len))) {
                if ((s1.substring(i,s1Len)).equals(s2.substring(0,s2Len-i))) {
                    return true;
                }
            }
        }

        return false;
    }
    
}
