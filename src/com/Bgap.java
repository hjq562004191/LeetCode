package com;

public class Bgap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.binaryGap(22));
    }

    static class Solution {
        public int binaryGap(int N) {
            String s = Integer.toBinaryString(N);
            System.out.println(s);
            int max = 0;
            String x = "1";
            char[] chars = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                System.out.println(chars[i]);
                if (1 == 1) {
                    System.out.println(111);
                    int count = 0;
                    int k;
                    for (k = i + 1; k < s.length(); k++) {
                        if (chars[k] == 0) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    if (count > max) {
                        max = count;
                    }
                    i = k;
                }
            }
            return max;
        }
    }
}
