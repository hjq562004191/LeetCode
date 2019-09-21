package PTA.test34;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = 1;
        int t = a;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < t; j++) {
                System.out.printf("%4s",k);
                k++;
            }
            t--;
            System.out.println();
        }
    }
}