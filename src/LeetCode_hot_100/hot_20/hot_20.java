package LeetCode_hot_100.hot_20;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/17 17:17
 */
public class hot_20 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }
    /**
     * 旋转图像
     * @param matrix n * n矩阵，顺时针旋转90度
     */
    public static void rotate(int[][] matrix) {
        int m = matrix.length; // 3
        int len = 0;
        if (m % 2 == 1) {
            len = m / 2 + 1;
        } else {
            len = m / 2;
        }
        for (int i = 0; i < len; i++) { // 往内部走了(i, i)
            for (int j = 0; j < m - 1 - i * 2; j++) {
                int tx = m - i * 2 - 1;
                int del_x_up = j; int del_y_up = tx - del_x_up;//+1 +2
                int del_x_right = del_y_up; int del_y_right = -del_x_up;
                int del_x_down = -del_x_up; int del_y_down = -del_y_up;
                int del_x_left = -del_y_up; int del_y_left = del_x_up;
                int x_up = i; int y_up = j + i;
                int x_right = x_up + del_x_up; int y_right = y_up + del_y_up;
                int x_down = x_right + del_x_right; int y_down = y_right + del_y_right;
                int x_left = x_down + del_x_down; int y_left = y_down + del_y_down;

                int temp_up = matrix[x_up][y_up];
                matrix[x_up][y_up] = matrix[x_left][y_left];
                matrix[x_left][y_left] = matrix[x_down][y_down];
                matrix[x_down][y_down] = matrix[x_right][y_right];
                matrix[x_right][y_right] = temp_up;
            }
        }
    }
}
