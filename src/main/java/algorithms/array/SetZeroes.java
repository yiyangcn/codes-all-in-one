package algorithms.array;
import java.util.ArrayList;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        // 1先记录0所在的位置
        // 2根据位置重置矩阵
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<ArrayList<Integer>> locations = new ArrayList<ArrayList<Integer>>();
        // 记录0所在位置
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j< n; j++) {
                ArrayList<Integer> location = new ArrayList<Integer>();
                int pre = matrix[i][j];
                if (pre == 0) {
                    location.add(i);
                    location.add(j);
                    locations.add(location);
                }
                
            }
        }
        // 根据位置重置矩阵
        int len = locations.size();
        System.out.println(locations);
        for (int i = 0; i < len; i++) {
            ArrayList<Integer> location = locations.get(i);
            // 重置行
            for (int j = 0; j < n; j++){
                matrix[location.get(0)][j] = 0;
            }
            // 重置列
            for (int z = 0; z < m; z++){
                matrix[z][location.get(1)] = 0;
            }
        } 
    }
    
}
