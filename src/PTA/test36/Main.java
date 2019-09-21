package PTA.test36;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] a = new int[4];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(0) < '0' || strings[i].charAt(0) > '9'){
                System.out.println("number input error");
                return;
            }else if (strings[i].length() != 1){
                System.out.println("Numerical range error");
                return;
            }else {
                a[i] = Integer.parseInt(strings[i]);
            }
        }
        Arrays.sort(a);
        String s1 = "";
        for (int i = 3; i >= 0 ; i--) {
            s1 += a[i];
        }
        String s2 = "";
        for (int i = 0; i < 4; i++) {
            s2 += a[i];
        }
        System.out.println(Integer.parseInt(s1)+" "+Integer.parseInt(s2));
    }
}