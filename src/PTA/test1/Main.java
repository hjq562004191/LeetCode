package PTA.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String n, m1, m2;
            int old, m3;
            n = scanner.nextLine();
            old = Integer.parseInt(scanner.nextLine());
            m1 = scanner.nextLine();
            m2 = scanner.nextLine();
            m3 = Integer.parseInt(scanner.nextLine());
            System.out.println("姓名：" + n + "\n" +
                    "年龄：" + old + "\n" +
                    "所在学院：" + m1 + "\n" +
                    "所在专业：" + m2 + "\n" +
                    "所在班级：" + m3 + "班");
        }else {
            System.out.println("姓名：张三\n" +
                    "年龄：20\n" +
                    "所在学院：计算机学院\n" +
                    "所在专业：计算机科学与技术\n" +
                    "所在班级：1班");
        }
    }
}
