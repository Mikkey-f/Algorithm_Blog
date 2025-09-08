package LeetCode_hot_100.hot_4;

import java.util.Arrays;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/8 15:50
 */
public class hot_4 {
    /**
     * 非零数保持相对顺序
     * @param nums 返回一个顺序
     */
    public void moveZeroes(int[] nums) {
        int front = 0; int end = 0;
        while (end < nums.length) {
            if (nums[end] != 0) {
                int t = nums[end];
                nums[end] = nums[front];
                nums[front] = t;
                front++;
            }
            end++;
        }
    }
}
