package PTA.test23;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i+=2) {
            if (i == 1){
                System.out.print(1);
            }else {
                System.out.print(" " + i);
            }
        }
    }
}