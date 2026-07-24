package com.exit_;

/**
 * @author lanyangyang
 */
public class ThreadExit_ {
    static void main(String[] args) throws InterruptedException {

        T t = new T();
        t.start();

        //如果希望main线程可以去控制t线程的终止，则必须可以修改loop

        //让main线程休眠十秒，再通知t线程退出
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}

class T extends Thread {
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T 运行中" + (++count));
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}