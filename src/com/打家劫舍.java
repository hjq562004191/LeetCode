package com;

public class 打家劫舍 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length < 3) {
            return Math.max(nums[0], nums[1]);
        }
        int p1 = 0, p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = Math.max(p2 + nums[i] , p1);
            p2 = p1;
            p1 = c;
        }
        return p1;
    }
//    public static int rob(int[] nums) {
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0],nums[1]);
//        for (int i = 2; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
//        }
//        return dp[nums.length-1];
//    }
}
