package PTA.test18;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int sum = 0;
        boolean f = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(0)=='-'){
                sum += Integer.parseInt(strings[i]);
            }else if (strings[i].charAt(0)>='0' && strings[i].charAt(0) <= '9'){
                sum += Integer.parseInt(strings[i]);
            }else {
                f = true;
            }
        }
        System.out.println(sum);
        if (f){
            System.out.println("attention");
        }
    }
}