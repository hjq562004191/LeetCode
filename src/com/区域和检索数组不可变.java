package com;

/**
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-query-immutable
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 区域和检索数组不可变 {
    public static void main(String[] args) {
        int[] a = {-2, 0, 3, -5, 2, -1};
        NumArray(a);
        int s = sumRange(2,5);
//        System.out.println(s);
    }
    public static int[] sum;
    public static void NumArray(int[] nums) {
        if (nums.length == 0){
            return;
        }
        sum = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + sum[i];
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(sum[i]);
//        }
    }

    public static int sumRange(int i, int j) {
        if (i == 0)
            return sum[j];
        else
            return sum[j] - sum[i-1];
    }
}
