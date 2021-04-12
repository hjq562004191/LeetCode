package com;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author JQiang
 * @create 2021/4/12 22:28
 *
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 *
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出："1"
 * 示例 4：
 *
 * 输入：nums = [10]
 * 输出："10"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 最大数 {
    public static void main(String[] args){

    }
    public static String largestNumber(int[] nums) {
        String[] ss = new String[nums.length];
        boolean f = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                f = true;
            }
            ss[i] = String.valueOf(nums[i]);
        }
        if (!f){
            return "0";
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Long.parseLong(o1+o2) - Long.parseLong(o2+o1) > 0){
                    return -1;
                }else {
                    return 1;
                }
            }
        };
        Arrays.sort(ss,comparator);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            stringBuilder.append(ss[i]);
        }
        return stringBuilder.toString();
    }
}
