package com;

public class Z字形变换 {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        convert(s,3);
    }
    public static String convert(String s, int numRows) {
        int len = s.length();
        if (len<numRows || s == "" || numRows == 1){
            return s;
        }
        int[][] map = new int[numRows][len];
        int k = 1,i;
        int t = 1,j = 0;
        for (i = 0; i < numRows;i+=t) {
            if (t > 0){
                map[i][j] = k;
            }else {
                ++j;
                map[i][j] = k;
            }
            if (i == numRows-1 || (i == 0&&k>numRows)){
                t = -t;
            }
            if (k == len)
                break;
            k++;
        }
//        for (int l = 0; l < numRows; l++) {
//            for (int m = 0; m <= j; m++) {
//                System.out.print(map[l][m] + " ");
//            }
//            System.out.println();
//        }
        String res = "";
        for (int l = 0; l < numRows; l++) {
            for (int m = 0; m <= j; m++) {
                if (map[l][m] != 0){
                    res += s.charAt(map[l][m]-1);
                }
            }
        }
//        System.out.println(res);
        return res;
    }
}
