package LeetCode_hot_100.hot_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/7 16:20
 */
public class hot_1 {
    /**
     * 两数之和
     * @param nums 一个整数数组
     * @param target 找到数组里面两个和为target的下标
     * @return 返回下标
     */
    public int[] twoSum(int[] nums, int target) {
    /*
        复杂度O(n^2)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
     */
        // 值 - 下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

}
