package com.method;

/**
 * @author lanyangyang
 */
public class ThreadMethod01 {
    static void main(String[] args) throws InterruptedException {

        //测试相关方法
        T t = new T();
        t.setName("lyy");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        //主线程打印五个hi 就中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        t.interrupt();
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //Thread.currentThread().getName()获取当前线程名称
                System.out.println(Thread.currentThread().getName() + "吃包子～ " + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中～");
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }

    }
}
