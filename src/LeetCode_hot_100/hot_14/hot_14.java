package LeetCode_hot_100.hot_14;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/14 14:09
 */
public class hot_14 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{4,7},{1,4}};
        System.out.println(Arrays.deepToString(merge(nums)));
    }
    /**
     * 合并区间
     * @param intervals 表示若干个区间的集合
     * @return 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间
     */
    public static int[][] merge(int[][] intervals) {
        Pair[] pairs = new Pair[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
        int[][] ans = new int[intervals.length][2];
        ans[0][0] = pairs[0].start; ans[0][1] = pairs[0].end;
        int temp = 0;
        for (int i = 1; i < intervals.length; i++) {
            int temp_x = ans[temp][0]; int temp_y = ans[temp][1];
            int now_x = pairs[i].start; int now_y = pairs[i].end;
            if (now_x <= temp_y && temp_y < now_y) {
                ans[temp][1] = now_y;
            } else if (now_x > temp_y) {
                ans[++temp][0] = now_x; ans[temp][1] = now_y;
            }
        }
        int[][] res = new int[temp + 1][2];
        for (int i = 0; i <= temp; i++) {
            res[i][0] = ans[i][0]; res[i][1] = ans[i][1];
        }
        return res;
    }

    static class Pair {
        int start, end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
