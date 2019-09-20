package PTA.test17;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (Integer.parseInt(strings[i]) < 0){
                System.out.print(0+",");
            }else if (Integer.parseInt(strings[i]) > 100){
                System.out.print(100+",");
            }else {
                System.out.print(strings[i]+",");
            }
        }
    }
}