package PTA.test30;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = "*";
        String b = " ";
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            String s1 = "";
            for (int j = 0; j < N - i -1; j++) {
                s1 += " ";
            }
            s1 += s;
            strings[i] = s1;
            System.out.println(s1);
            s+="**";
        }
        for (int i = N-2; i >= 0 ; i--) {
            System.out.println(strings[i]);
        }
    }
}