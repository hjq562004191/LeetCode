package PTA.test21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int maxnum = 0;
        for (int i = 0; i < N; i++) {
            int a =scanner.nextInt();
            if (map.containsKey(a)){
                map.put(a,map.get(a)+1);
                if (map.get(a) > max){
                    max = map.get(a);
                    maxnum = a;
                }
            }else {
                map.put(a,1);
            }
        }
        System.out.println(maxnum + " " + max);
    }
}