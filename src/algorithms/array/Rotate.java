package algorithms.array;

public class Rotate {

    public void rotate(int[][] matrix) {
        // 123    741 852 963    1234      
        // 456                   5678
        // 789                   910 11 12
        // https://leetcode-cn.com/problems/rotate-matrix-lcci

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[n][n];
        // 新数组的行坐标和列坐标
        int row = 0;
        int column = 0;
        // 列
        for (int i = 0; i < n; i++) {
            // 行
            for (int j = m-1; j >= 0; j--) {
                temp[row][column] = matrix[j][i];
                column++;
            }
            row++;
            column = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}