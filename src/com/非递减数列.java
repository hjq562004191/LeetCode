package com;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 *
 * 示例 1:
 *
 * 输入: [4,2,3]
 * 输出: True
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * 示例 2:
 *
 * 输入: [4,2,1]
 * 输出: False
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 * 说明:  n 的范围为 [1, 10,000]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/non-decreasing-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 非递减数列 {
    public static void main(String[] args) {
        int[] s = {4,2,1};
        boolean t = checkPossibility(s);
        System.out.println(t);
    }
    public static boolean checkPossibility(int[] nums) {
        if (nums.length < 3){
            return true;
        }
        int i=0,j=nums.length-1;
        while (i<j && nums[i] <= nums[i+1]){
            i++;
        }
        while (i<j && nums[j] >= nums[j-1]){
            j--;
        }
        //只有在j,i相邻时候才有可能满足条件
        //因为不相邻的时候显然有两个位置需要调整
        //然后如果i或者j之一在边缘，那么直接调整对应位置就行了（如1,3,7,2，直接把2调大就好，没啥限制）
        //如果两个都不在边界，那就有两种情况，要么把i对应位置调小至和j对应位置一样大，但是这时候要保证调小之后的i位置比他前面的数值答，也就是nums[i-1]<=nums[j]
        //同理调大j位置的数值要保证，调大后的数值比j+1位置的数值小，即nums[i]<=nums[j+1]
        if (i+1>=j && (i ==0|| j == nums.length-1 || nums[i-1] <= nums[j] || nums[i] <= nums[j+1])){
            return true;
        }else {
            return false;
        }
    }
}
