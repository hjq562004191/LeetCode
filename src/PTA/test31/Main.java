package PTA.test31;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0L;
        long a = 6L;
        for (int i = 0; i < N; i++) {
            sum += a;
            a = a*10 +6L;
        }
        System.out.println(sum);
    }
}