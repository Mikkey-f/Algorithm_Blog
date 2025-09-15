package LeetCode_hot_100.hot_15;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/15 20:09
 */
public class hot_15 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    /**
     * 轮转数组
     * @param nums 给定一个数组
     * @param k 将数组中的元素向右轮转k个位置，其中k是非负数
     *
     */
    public static void rotate(int[] nums, int k) {
        int mod = k % nums.length;
        int[] ans = new int[nums.length];
        int cnt = 0;
        for (int i = nums.length - mod; i < nums.length; i++) { //mod
            ans[cnt++] = nums[i];
        }
        for (int i = 0; i < nums.length - mod; i++) {
            ans[cnt++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}
