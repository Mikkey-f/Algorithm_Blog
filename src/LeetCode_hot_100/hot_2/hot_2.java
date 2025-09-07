package LeetCode_hot_100.hot_2;

import java.util.*;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/7 16:40
 */
public class hot_2 {
    /**
     * 字母异位词
     *
     * @param strs 给定一系列字符串
     * @return 返回字符序列
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // 返回的答案
        ArrayList<List<String>> lists = new ArrayList<>();
        // 答案中的子字符串
        ArrayList<String>[] ans = new ArrayList[strs.length];
        // 临时存储
        String[] temp = new String[strs.length];

        int[] nums = new int[26];
        for (int i = 0; i < strs.length; i++) {
            temp[i] = "";
            for (int j = 0; j < strs[i].length(); j++) {
                nums[strs[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                temp[i] += (char)(nums[j] + '0');
            }
            Arrays.fill(nums, 0);
        }
        // v-k

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(temp[i])) {
                ans[map.get(temp[i])].add(strs[i]);
            } else {
                map.put(temp[i], i);
                ans[i] = new ArrayList<>();
                ans[i].add(strs[i]);
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if (ans[i] != null) {
                lists.add(ans[i]);
            }
        }
        return lists;
    }
}
