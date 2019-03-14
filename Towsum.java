package com;

public class sum {
    public static void main(String[] args) {
        int[] s ={3,2,4};
        Solution solution = new Solution();
        int[] q = solution.twoSum(s,6);
        System.out.println(q[0]+" "+q[1]);
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int i = 0,j = 0;
            int [] a = new int[2];
            int len = nums.length;
            for (i = 0; i < len-1; i++) {
                for (j = i+1; j < len; j++) {
                    if (nums[i] + nums[j] == target) {
                        a[0] = i;
                        a[1] = j;
                        break;
                    }
                }
            }
            return a;
        }
    }
}
