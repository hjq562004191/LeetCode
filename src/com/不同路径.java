package com;

public class 不同路径 {
    public static void main(String[] args) {
        uniquePaths(7,3);
    }
    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1){
            return 1;
        }
        int[] dp = new int[m];
        dp[0] = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                dp[i] = dp[i] + dp[i-1];
            }
        }
        System.out.println(dp[m-1]);
        return dp[m-1];
    }
}
