package LeetCode_hot_100.hot_17;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/16 14:30
 */
public class hot_17 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    /**
     * 缺失的第一个正数
     * @param nums 未排序的整数数组
     * @return 找出其中没有出现的最小正整数
     * 时间复杂度O(n) 空间复杂度O(1)
     */
    public static int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (num > 0 && !map.containsKey(num)) {
                map.put(num, 1);
            }
        }
        int ans = 0;
        for (int i = 1; i < 1e9; i++) {
            if (!map.containsKey(i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
