package LeetCode_hot_100.hot_10;

import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/13 16:02
 */
public class hot_10 {
    public static void main(String[] args) {
        int[] nums = {1,1,1}; int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    /**
     * 和为K的子数组
     * @param nums 一系列整数数组
     * @param k 一个整数k
     * @return 统计并返回该数组中和为k的子数组个数
     * 子数组和为k
     */
    public static int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        // v - k
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int p = map.getOrDefault(sum[i] - k, 0);
            if (p != 0) {
                ans += p;
            }
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);

        }

        return ans;
    }
}
