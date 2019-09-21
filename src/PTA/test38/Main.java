package PTA.test38;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int op = scanner.nextInt();
        int[][] map = new int[m][n];
        if (op == 90 || op == -90 || op == 180){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!scanner.hasNextInt()){
                        System.out.println("data type error");
                        return;
                    }
                    map[i][j] = scanner.nextInt();
                    if (map[i][j] < 0 || map[i][j] > 255){
                        System.out.println("matrix data error");
                        return;
                    }
                }

            }
        }else {
            System.out.println("angle data error");
        }
        if (op == 90){
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < m; j++) {
                    if (j == m-1){
                        System.out.print(map[j][i]);
                    }else {
                        System.out.print(map[j][i] + " ");
                    }
                }
                System.out.println();
            }
        }else if (op == -90){
            for (int i = 0; i < n; i++) {
                for (int j = m-1; j >= 0; j--) {
                    if (j == 0){
                        System.out.print(map[j][i]);
                    }else {
                        System.out.print(map[j][i] + " ");
                    }
                }
                System.out.println();
            }
        }else if (op == 180){
            for (int i = m-1; i >= 0; i--) {
                for (int j = n-1; j >= 0; j--) {
                    if (j == 0){
                        System.out.print(map[i][j]);
                    }else {
                        System.out.print(map[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}