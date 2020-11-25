package com;

import java.util.HashSet;
import java.util.Set;

public class 最长无重复字串 {
    public static void main(String[] args){
        int a = lengthOfLongestSubstring("abcab");
        System.out.println(a);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))){
                    max = set.size() > max ? set.size():max;
                    set.clear();
                    break;
                }else {
                    set.add(s.charAt(j));
                }
            }
        }
        return max;
    }
}
