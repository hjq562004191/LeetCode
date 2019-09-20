package PTA.test26;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] map = new int[25];
        map[0] = 1;
        map[1] = 1;
        for (int i = 2; i < 25; i++) {
            map[i] = map[i-1] + map[i-2];
        }
        System.out.println(map[N]);
    }
}