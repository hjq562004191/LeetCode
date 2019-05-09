package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("aab");
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 1 ){
            return 1;
        }
        if (len == 2){
            if (s.charAt(0) == s.charAt(1)){
                return 1;
            }else {
                return 2;
            }
        }
        if (s == ""){
            return 0;
        }
        int max = 0;
        Set<Character> set;
        for (int i = 0; i < len; i++) {
            set = new HashSet<>();
//            set.add(s.charAt(i));
            for (int j = i; j < len; j++) {
                if (set.contains(s.charAt(j))){
                    if (set.size() > max){
                        max = set.size();
                        break;
                    }else {
                        break;
                    }
                }else {
                    set.add(s.charAt(j));
                }
                if (j == len - 1){
                    if (set.size() > max)
                        max = set.size();
                }
            }
        }
        System.out.println(max);
        return max;
    }
}
