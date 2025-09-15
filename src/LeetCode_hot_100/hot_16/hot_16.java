package LeetCode_hot_100.hot_16;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/15 20:57
 */
public class hot_16 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    /**
     * 除自身以外数组的乘积
     * @param nums 整数数组
     * @return ans[i] = nums[0] * nums[i - 1] * nums[i + 1]....
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] * nums[i];
        }
        int temp = 1;
        int[] ans = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) break;
            if (i == nums.length - 1) {
                ans[i] = temp * sum[i - 1];
            } else {
                ans[i] = sum[i - 1] * temp;
            }
            temp *= nums[i];
        }
        ans[0] = temp;
        return ans;
    }
}
