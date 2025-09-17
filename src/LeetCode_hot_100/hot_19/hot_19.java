package LeetCode_hot_100.hot_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/17 16:48
 */
public class hot_19 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }
    /**
     * 螺旋矩阵
     * @param matrix m * n的矩阵
     * @return 按照顺时针螺旋顺序返回所有元素
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
        int cnt = 0; int ptr = 1; // 0上 1右 2下 3左
        List<Integer> res = new ArrayList<>();
        int nowx = 0; int nowy = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while (cnt < m * n) {
            cnt++; res.add(matrix[nowx][nowy]); matrix[nowx][nowy] = Integer.MIN_VALUE;
            if (ptr == 0) {
                nowx--;
            } else if (ptr == 1) {
                nowy++;
            } else if (ptr == 2) {
                nowx++;
            } else {
                nowy--;
            }

            if (nowx < 0 || nowy < 0 || nowx > m - 1 || nowy > n - 1 || matrix[nowx][nowy] == Integer.MIN_VALUE) {
                if (ptr == 0) {
                    nowx++;
                } else if (ptr == 1) {
                    nowy--;
                } else if (ptr == 2) {
                    nowx--;
                } else {
                    nowy++;
                }
                for (int i = 0; i < 4; i++) {
                    int tempX = nowx + dx[i]; int tempY = nowy + dy[i];
                    if (tempX >= 0 && tempX <= m - 1 && tempY >= 0 && tempY <= n - 1 && matrix[tempX][tempY] != Integer.MIN_VALUE) {
                        ptr = i; nowx = tempX; nowy = tempY;
                        break;
                    }
                }
            }

        }
        return res;
    }
}
