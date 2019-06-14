package com;

import java.util.Arrays;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 *
 */


public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        int[] s = searchRange(a,8);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
    public static int[] searchRange(int[] nums, int target) {
        //特殊情况:只有一个元素
        if (nums.length == 1) {
            if (nums[0] == target) return new int[]{0, 0};
            else return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        int flag = Integer.MIN_VALUE;
        //二分查找
        while (left <= right) {
            int mid = (right + left) >> 1;
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else {
                flag = mid;//找到时用flag传递
                break;
            }
        }
        if (flag == Integer.MIN_VALUE) return new int[]{-1, -1};//flag没有刷新，证明不存在target
        int i = flag, j = flag;
        //从mid处向左右两边搜索
        for (; i >= 0; i--) if (nums[i] != nums[flag]) break;
        for (; j <= nums.length - 1; j++) if (nums[j] != nums[flag]) break;
        return new int[]{i + 1, j - 1};
    }
}
