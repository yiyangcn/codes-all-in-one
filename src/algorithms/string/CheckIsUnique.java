package algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class CheckIsUnique {
    static public boolean checkDifferent(String iniString) {
        // write code here
        // O(n)  
        // leetcode https://leetcode-cn.com/problems/is-unique-lcci/

        List<String> list = new ArrayList<String>();
        for (int i = 1; i<=iniString.length(); i++) {
            if (list.size() == 0 || !list.contains(iniString.substring(i-1,i))) {
                list.add(iniString.substring(i-1,i));
                System.out.println(list);
            } else {
                return false;
            }
            
        }
        return true;
    }
    
    static public boolean bitDifferent(String iniString) {
        return true;
    }
    static public boolean indexOfCheck(String iniString) {
        int len = iniString.length();
        for (int i=0; i < len-1; i++) {
            char c = iniString.charAt(i);
            if (iniString.indexOf(c, i+1) !=-1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String iniString = "fbcdbea";
        System.out.println(iniString.indexOf(0));
        System.out.println(checkDifferent(iniString));
    }
}