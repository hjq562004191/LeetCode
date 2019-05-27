package com;

import java.util.Set;

public class 买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] p = new int[6];
        p[0] = 7;
        p[1] = 1;
        p[2] = 5;
        p[3] = 3;
        p[4] = 6;
        p[5] = 4;

        System.out.println(maxProfit(p));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        for (int i = 0; i < len - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                continue;
            } else {
                for (int j = 1; j < len - i; j++) {
                    if (prices[i + j] - prices[i] > max) {
                        max = prices[i + j] - prices[i];
                    }
                }
            }
        }
        return max;
    }
}
