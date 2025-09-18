package LeetCode_hot_100.hot_21;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/18 12:20
 */
public class hot_21 {
    /**
     * 搜索二维矩阵
     * @param matrix m * n矩阵，每行从左到右升序，每列从上到下升序
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; int m = matrix[0].length;
        int x = 0; int y = m - 1;
        while (x >= 0 && x < n && y >= 0 && y < m) {
            if (target > matrix[x][y]) {
                // 向大
                x++;
            } else if (target < matrix[x][y]) {
                y--;
            } else {
                return true;
            }
        }
        return false;
    }
}
