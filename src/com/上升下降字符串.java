package com;

import java.util.*;

public class 上升下降字符串 {
    public static void main(String[] args){
        String s = sortString("aaaabbbbcccc");
        System.out.println(s);
    }
    public static String sortString(String s) {
        int count = 0;
        String list ="";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else {
                map.put(chars[i], 1);
            }
        }
        count = map.size();
        while (count != 0) {
            for (Map.Entry<Character, Integer> e :
                    map.entrySet()) {
                if (e.getValue() > 0) {
                    list+=e.getKey();
                    e.setValue(e.getValue() - 1);
                } else if (e.getValue() == 0){
                    count--;
                    e.setValue(e.getValue() - 1);
                }
            }
            Stack<Character> stack = new Stack<>();
            for (Map.Entry<Character, Integer> e :
                    map.entrySet()) {
                if (e.getValue() > 0) {
                    stack.push(e.getKey());
                    e.setValue(e.getValue() - 1);
                } else if (e.getValue() == 0){
                    count--;
                    e.setValue(e.getValue() - 1);
                }
            }
            while (!stack.empty()){
                list+=stack.pop();
            }
        }
        return list;
    }
}
