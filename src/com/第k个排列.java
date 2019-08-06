package com;

import javax.xml.stream.FactoryConfigurationError;

/**
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 *
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 *
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 *
 * 说明：
 *
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 示例 1:
 *
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 示例 2:
 *
 * 输入: n = 4, k = 9
 * 输出: "2314"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-sequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 第k个排列 {
    public static void main(String[] args) {
        getPermutation(3,2);
    }
    static int m;
    static String result;
    public static String getPermutation(int n, int k) {
        m = 0;
        int[] map = new int[n+1];
        StringBuilder sb = new StringBuilder();
        result = "";
        DFS(map,sb,n,k);
        System.out.println(result);
        return result;
    }

    private static void DFS( int[] map, StringBuilder sb,int n,int k) {
        if (sb.length() == n){
            if (m == k-1){
               result = sb.toString();
            }
            m++;
        }else if (result.equals("")){
            for (int i = 1; i <= n; i++) {
                if (map[i] != 1) {
                    sb.append(i);
                    map[i] = 1;
                    DFS(map, sb, n,k);
                    map[i] = 0;
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
    }
//    static int FAC[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
//    public static String getPermutation(int n, int k) {
//        int pre_num = k-1;  //说明k之前有 k-1个排列
//        int[] map = new int[10];
//        StringBuilder sb = new StringBuilder();
//        while (n-- != 0){
//            int index = pre_num / FAC[n];
//            pre_num = pre_num % FAC[n];
//            while (true){
//                if (map[index+1] == 1){
//                    index++;
//                }else {
//                    sb.append(index+1);
//                    map[index+1] = 1;
//                    break;
//                }
//            }
//        }
//        System.out.println(sb.toString());
//        return sb.toString();
//    }


}
