package com;

public class 最长公共前缀 {
    public static void main(String[] args) {
        String[] s = new String[0];
//        s[0] = "";
//        s[1] = "flow";
//        s[2] = "flight";
        longestCommonPrefix(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        String preStr = "";

        int len = strs.length;
        if (len == 1){
            return strs[0];
        }
        if (len == 0){
            return preStr;
        }
        boolean f = true;
        int k = 0;
        while (f) {
            for (int i = 0; i < len - 1; i++) {
                if (strs[i] == "") {
                    f= false;
                    break;
                }else if (strs[i].length() > k && strs[i+1].length() > k){
                    if (strs[i].charAt(k) != strs[i+1].charAt(k)){
                        f = false;
                        break;
                    }
                }else{
                    f = false;
                    break;
                }
            }
            k++;
        }
//        if (k == 1)
//            preStr = strs[0];
//        else
        preStr = strs[0].substring(0,k-1);


        System.out.println(preStr);
        return preStr;
    }
}
