package PTA.test24;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
}