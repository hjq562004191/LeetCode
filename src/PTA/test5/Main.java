package PTA.test5;

import java.util.Scanner;
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("在这里给出一组输入。例如：");
        String n = scanner.nextLine();
        String[] s = n.split(" ");
//        System.out.println("在这里给出相应的输出。例如：");
        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
    }
}
