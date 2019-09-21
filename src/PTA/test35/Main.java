package PTA.test35;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = 1;
        int t = a;
        int[][] map = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < t; j++) {
                map[j][i] = k;
//                System.out.printf("%4s",k);
                k++;
            }
            t--;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (map[i][j] != 0){
                    System.out.printf("%4s",map[i][j]);
                }
            }
            System.out.println();
        }
    }
}