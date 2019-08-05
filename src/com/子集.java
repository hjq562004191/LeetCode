package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 子集 {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = (int) Math.pow(2,nums.length);
        String[] s = new String[len];
        for (int i = 0; i < len; i++) {
            s[i] = Integer.toBinaryString(i);
        }
        for (int i = 0; i < len; i++) {
            List<Integer> list = new ArrayList<>();
            int k = s[i].length()-1;
            for (int j = nums.length-1; j >= nums.length - s[i].length(); j--) {
                if (s[i].charAt(k--) == '1'){
                    list.add(nums[j]);
                }
            }
            lists.add(list);

        }
        return lists;
    }
}
