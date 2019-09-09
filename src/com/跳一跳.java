package com;

/**
 * CCF真题
 */
public class 跳一跳 {
    public static void main(String[] args) {
        int sum = 0;
        int f = 0;
        int[] jmp = {1,1,2,2,2,1,1,2,2,0};
        for (int i = 0; i < jmp.length; i++) {
            if (jmp[i] == 0){
                break;
            }else if (jmp[i] == 2){
                sum += jmp[i] + f;
                f = f + 2;
            }else {
                f = 0;
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
