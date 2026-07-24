package com.syn;

/**
 * @author lanyangyang
 */
public class SellTicket {
    static void main(String[] args) {

//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

//实现接口方法，使用synchronized实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;//让多个线程共享ticketNum
    private boolean loop = true;


    //1.public synchronized void sell(){}就是一个同步方法
    //2.这是锁在this对象
    //3.也可以在代码块上写 synchronized 同步代码块 互斥锁 还是在this对象

    //同步方法（静态的）的锁为当前类本身
    //老韩解读
    //1. public synchronized static void m1() {} 锁是加在 SellTicket03.class
    //2. 如果在静态方法中，实现一个同步代码块.
        /*
        synchronized (SellTicket03.class) {
        System.out.println("m2");
        }
        */
    public synchronized static void m1() {
    }

    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }

    public /*synchronized*/ void sell() {//同步方法，在同一时刻还能用一个线程来执行sell方法
        synchronized (this) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }

            //休眠50毫秒
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数=" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {

            sell();

        }
    }
}

//使用Thread方式

class SellTicket01 extends Thread {

    private static int ticketNum = 100;//让多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数=" + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;//让多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数=" + (--ticketNum));
        }
    }
}