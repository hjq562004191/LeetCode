package com;

import sun.font.FontRunIterator;

import java.util.Arrays;

public class 合并区间 {
    public static void main(String[] args) {
        int[][] a ={
                {1,4},
                {2,3},
        };
        merge(a);
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0){
            return intervals;
        }
        for (int i = 0; i < intervals.length-1; i++) {
            for (int j = 0; j < intervals.length - i - 1; j++) {
                if (intervals[j][0] > intervals[j+1][0]){
                    int temp = intervals[j][0];
                    intervals[j][0] = intervals[j+1][0];
                    intervals[j+1][0] = temp;
                }
                if (intervals[j][1] > intervals[j+1][1]){
                    int temp = intervals[j][1];
                    intervals[j][1] = intervals[j+1][1];
                    intervals[j+1][1] = temp;
                }
            }
        }

        int[][] map = new int[intervals.length][intervals[0].length];
        int m = 0;//检查map一共有几层
        for (int i = 0; i < intervals.length; i++) {
            map[m][0] = intervals[i][0];
            if (i != intervals.length-1)
            while (intervals[i][1] >= intervals[i+1][0]){
                i++;
                if (i == intervals.length-1){
                    break;
                }
            }
            map[m][1] = intervals[i][1];
            m++;
        }
        int[][] result = new int[m][2];
        for (int i = 0; i < m; i++) {
            result[i] = map[i];
        }
        return result;
    }
}
