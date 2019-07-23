package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 自除数 {
    public static void main(String[] args) {

    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (fun(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean fun(int n){
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                return false;
            }
            if (n%(s.charAt(i)-'0')!=0){
                return false;
            }
        }
        return true;
    }
}
