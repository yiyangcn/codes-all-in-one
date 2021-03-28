package algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class Different {
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

    public static void main(String[] args) {
        String iniString = "fbcdbea";
        System.out.println(checkDifferent(iniString));
    }
}