package ThreadTest;

import java.util.concurrent.Semaphore;

public class Thread_3 {
    static int[] num1 = {1, 3, 5, 7, 9};
    static int[] num2 = {2, 4, 6, 8, 10, 11, 12};
    static volatile int i = 0;
    static volatile int j = 0;

    public static void main(String[] args) {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i < num1.length) {
                    try {
                        s1.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + num1[i++]);
                    if (j >= num2.length) {
                        s1.release();
                    } else {
                        s2.release();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (j < num2.length) {
                    try {
                        s2.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + num2[j++]);
                    if (i >= num1.length) {
                        s2.release();
                    }else {
                        s1.release();
                    }
                }
            }
        }).start();
    }
}
