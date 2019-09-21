package PTA.test32;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i < N; i++) {
            System.out.print(i + " ");
        }
        for (int i = N; i >= 1 ; i--) {
            if (i == 1){
                System.out.print(i);
            }else {
                System.out.print(i + " ");
            }
        }
    }
}