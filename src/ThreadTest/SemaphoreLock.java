package ThreadTest;

import java.util.concurrent.Semaphore;

public class SemaphoreLock {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Output(Output.semaphore1, Output.semaphore2).Output();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                new Output(Output.semaphore2, Output.semaphore3).Output();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Output(Output.semaphore3, Output.semaphore4).Output();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Output(Output.semaphore4, Output.semaphore5).Output();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Output(Output.semaphore5, Output.semaphore1).Output();
            }
        }).start();

    }


}

class Output {
    static Semaphore semaphore1 = new Semaphore(1);  //参数为1时为普通的锁  大于1时是共享锁
    static Semaphore semaphore2 = new Semaphore(0);  //参数为1时为普通的锁  大于1时是共享锁
    static Semaphore semaphore3 = new Semaphore(0);  //参数为1时为普通的锁  大于1时是共享锁
    static Semaphore semaphore4 = new Semaphore(0);  //参数为1时为普通的锁  大于1时是共享锁
    static Semaphore semaphore5 = new Semaphore(0);  //参数为1时为普通的锁  大于1时是共享锁

    public Output(Semaphore s1, Semaphore s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    private Semaphore s1;
    private Semaphore s2;

    public void Output() {

        try {
            s1.acquire();
            System.out.println(Thread.currentThread().getName() + " start at:" + System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName() + " end at:  " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s2.release();
        }
    }
}