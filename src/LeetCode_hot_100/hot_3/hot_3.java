package LeetCode_hot_100.hot_3;

import java.util.*;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/8 12:07
 */
public class hot_3 {
    /**
     * 最长连续序列
     * @param nums 未排序的整数数组
     * @return 数组连续最长序列
     */
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int res = Integer.MIN_VALUE;
        for (int num : nums) {
            set.add(num);
            res = Math.max(res, num);
        }
        int x = 0; int y = 0;
        int ans = 0;
        for (Integer i : set) {
            if (set.contains(i - 1)) {
                continue;
            }
            x = i;
            for (int j = x; j <= res; j++) {
                if (set.contains(j)) {
                    y = j;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, y - x + 1);
        }
        return ans;
    }
}
