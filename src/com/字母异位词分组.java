package com;

import javax.xml.stream.events.Characters;
import java.util.*;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 说明：
 *
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 *
 */
public class 字母异位词分组 {
    public static void main(String[] args) {
        String [] s = {"eat", "tea", "tan", "ate", "nat","bat"};
        groupAnagrams(s);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new LinkedList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(String.valueOf(chars))){
                map.get(String.valueOf(chars)).add(strs[i]);
            }else {
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(String.valueOf(chars),list);
            }
        }
        for (List<String> l:map.values()
             ) {
            lists.add(l);
        }
        return lists;
    }
}
