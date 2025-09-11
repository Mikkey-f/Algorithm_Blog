package LeetCode_hot_100.hot_5;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/11 19:51
 */
public class hot_5 {
    /**
     * 盛最多水的容器
     * @param height 容器的谁水列表
     * @return 返回最大面积
     * (y - x) * min(y_h, x_h)
     * ->
     * len * min(y_h, x_h)
     */
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int ans = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
