package com.threaduse;

/**
 * @author lanyangyang
 */
public class Thread01 {
    static void main(String[] args) throws InterruptedException{

        //创建Cat对象可以当作线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        //cat.run();//run方法就是一个普通方法，没有真正地启动一个线程，所以会先把run方法执行完毕再向下执行
        //当main线程启动一个子线程Thread-0，主线程不会堵塞，会继续执行。
        //这时候主线程和子线程交替执行

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程i " + i);
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}

//1.当一个类继承Thread类，该类就可以当作线程使用
//2.我们会重写run方法，然后写自己的业务逻辑
//run Thread类实现了 Runnable 接口的run方法
class Cat extends Thread{

    int times = 0;
    @Override
    public void run() {//重写run方法，然后写自己的业务逻辑

        while (true){
            //该线程每隔一秒，在控制台输出“懒羊羊大王”
            //当输出80次，则退出线程
            System.out.println("懒羊羊大王" + (++times) + "线程名" + Thread.currentThread().getName());
            //让该线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 8){
                break;
            }
        }

    }
}