package ThreadTest;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Thread_2 {
    public static volatile int i = 1;

    public static void main(String[] args) {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <= 100){
                    try {
                        s1.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 3 != 0 && i % 5 != 0){
                        System.out.println(Thread.currentThread().getName()+" "+i++);
                    }
                    if (i % 3 == 0 ||i % 5 == 0){
                        s2.release();
                    }else {
                        s1.release();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <= 100){
                    try {
                        s2.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 3 == 0 ){
                        System.out.println(Thread.currentThread().getName()+" "+i++);
                    }
                    if (i % 3 != 0 && i % 5 != 0){
                        s1.release();
                    }else {
                        s3.release();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <= 100){
                    try {
                        s3.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i % 5 == 0 ){
                        System.out.println(Thread.currentThread().getName()+" "+i++);
                    }
                    if (i % 3 != 0 ){
                        s1.release();
                    }else {
                        s2.release();
                    }
                }
            }
        }).start();

    }
}
