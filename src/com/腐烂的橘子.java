package com;

public class 腐烂的橘子 {
    static class Solution {
        public int orangesRotting(int[][] grid) {

            int min = 0;
            int count = 0;
            int ilen = grid.length;
            int jlen = grid[0].length;
            int k = 0;
            int[] itemp = new int[10];
            int[] jtemp = new int[10];
            for (int i = 0; i < ilen; i++) {
                for (int j = 0; j < jlen; j++) {
                    if (grid[i][j] == 1){
                        count++;
                    }
                    if (grid[i][j] == 2){
                        itemp[k] = i;
                        jtemp[k++] = j;
                    }
                }
            }
            if (count == 0 || k == 0)
                return 0;
//            System.out.println(count);
            boolean flag = true;
            int max;
            while (count != 0 && flag) {
                flag = false;
                max = k;
                k = 0;
                for (int i = 0; i < max; i++) {
                        if (grid[itemp[k]][jtemp[k]] == 2){
                            if (itemp[k] > 0 && grid[itemp[k]-1][jtemp[k]] == 1){
                                grid[itemp[k]-1][jtemp[k]] = 2;
                                count--;
                                flag = true;
                            }
                            if (itemp[k] < ilen-1 && grid[itemp[k]+1][jtemp[k]] == 1){
                                grid[itemp[k]+1][jtemp[k]] = 2;
                                count--;
                                flag = true;
                            }
                            if (jtemp[k] > 0 && grid[itemp[k]][jtemp[k]-1] == 1){
                                grid[itemp[k]][jtemp[k]-1] = 2;
                                count--;
                                flag = true;
                            }
                            if (jtemp[k] < jlen-1 && grid[itemp[k]][jtemp[k]+1] == 1){
                                grid[itemp[k]][jtemp[k]+1] = 2;
                                count--;
                                flag = true;
                            }
                        }
                        k++;
                }
                min++;
                k = 0;
                for (int i = 0; i < ilen; i++) {
                    for (int j = 0; j < jlen; j++) {
                        if (grid[i][j] == 2){
                            itemp[k] = i;
                            jtemp[k++] = j;
                        }
                    }
                }
            }
            if (flag == false)
                return -1;
            return min;
        }
    }
    public static void main(String[] args) {
        int[][] nums;
        nums  = new int[][]{{2,1,1},
                {1,1,0},
                {0,1,1}};
        Solution s= new Solution();
        System.out.println(s.orangesRotting(nums));
    }
}
