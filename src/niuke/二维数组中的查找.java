package niuke;

import java.io.File;

public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] map = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        System.out.println(Find(210,map));
    }
    public static boolean Find(int target, int [][] array) {
        int t1 = array.length;
        System.out.println(t1);
        int t2 = array[0].length;
        System.out.println(t2);
        for(int i = 0;i < t1;i++){
            for(int j = 0;j < t2;j++){
                if(array[i][j] > target){
                    t1 = i;
                }
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
