package LeetCode_hot_100.hot_20;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/16 14:43
 */
public class hot_20 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
    /**
     * 矩阵置零
     * @param matrix m * n 的矩阵, 一个元素为0，则将其所在行和列都设置为0
     * 想到了O(n + m)的方法，但是O(1)没有想到
     */
    public static void setZeroes(int[][] matrix) {
        // 空间复杂度O(n + m)
//        int[] row = new int[matrix.length];
//        int[] col = new int[matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 0) {
//                    row[i] = 1; col[j] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < row.length; i++) {
//            if (row[i] == 1) {
//                for (int j = 0; j < col.length; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        for (int i = 0; i < col.length; i++) {
//            if (col[i] == 1) {
//                for (int j = 0; j < row.length; j++) {
//                    matrix[j][i] = 0;
//                }
//            }
//        }
        // 空间复杂度O(1)
        boolean isFirstRow = false;
        boolean isFirstCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstCol = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                isFirstRow = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (isFirstRow) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        int t = 0;
    }
}
