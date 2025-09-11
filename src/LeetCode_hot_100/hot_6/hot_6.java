package LeetCode_hot_100.hot_6;

import java.util.*;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/11 20:17
 */
public class hot_6 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        System.out.println(threeSum(nums));
    }
    /**
     * 三数之和
     * @param nums 数字数组
     * @return 返回三数之和为0的集合
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1; int right = nums.length - 1;
            int target = -nums[i];
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]); list.add(nums[left]); list.add(nums[right]);
                    res.add(list);
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
