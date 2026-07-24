package com.method;

/**
 * @author lanyangyang
 */
public class ThreadMethod03 {
    static void main(String[] args) throws InterruptedException {

        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //我们希望当main线程结束后，子线程自动退出
        //则只需要将子线程设置为守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 0; i <= 10; i++) {

            System.out.println("aaaa");
            Thread.sleep(1000);
        }

    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hhhh");
        }
    }
}