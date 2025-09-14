package LeetCode_hot_100.hot_13;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/14 13:58
 */
public class hot_13 {
    /**
     * 最大子数组和
     * @param nums 一个整数数组
     * @return 返回具有最大和的连续子数组
     * 动态规划
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum + nums[i] >= nums[i]) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
