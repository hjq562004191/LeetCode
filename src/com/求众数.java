package com;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 求众数 {
    public static void main(String[] args) {
        int i = majorityElement(new int[]{2,1});
        System.out.println(i);
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int p=0;
        for (int i = 1; i <= nums.length-1; i++) {
            if (nums[i] == nums[i-1]){
                continue;
            }else {
                if (i-p>nums.length/2){
                    return nums[i-1];
                }
                p=i;
            }
        }
        return nums[nums.length-1];
    }
}
