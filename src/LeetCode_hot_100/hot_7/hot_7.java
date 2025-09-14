package LeetCode_hot_100.hot_7;

import java.util.Stack;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/13 14:45
 */
public class hot_7 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }
    /**
     * 接雨水
     * @param height 给定一系列柱子高度
     * @return 返回接到的雨水量
     * 什么时候能够接到水，高-低-高
     */
    public static int trap(int[] height) {
        Stack<Pair> s = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            if (!s.isEmpty()) {
                Pair top = s.peek();
                if (top.h < height[i]) {
                    // 计算逻辑
                    s.pop();
                    while (!s.isEmpty()) {
                        Pair bottom  = s.peek();
                        if (top == bottom) break;
                        if (bottom.h <= height[i]) {
                            s.pop();
                        }
                        // 左边高度小于等于当前柱子
                        int deltax = i - bottom.x - 1;
                        int deltay = Math.min(bottom.h, height[i]) - top.h;
                        ans += deltay * deltax;
                        top = bottom;
                    }
                }
            }
            Pair pair = new Pair(i, height[i]);
            s.push(pair);
        }
        return ans;
    }

    static class Pair {
        int x;
        int h;

        public Pair(int x, int h) {
            this.x = x;
            this.h = h;
        }
    }
}
