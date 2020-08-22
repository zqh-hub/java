package com.process.java;

import org.junit.Test;

/*
 * 线程控制
 * sleep()
 * join()
 *
 * */
public class ProcessTest03 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01("线程1");
        Thread01 t2 = new Thread01("线程2");
        Thread01 t3 = new Thread01("线程3");
        t1.start();
        try {
            // join():调用者执行完之后，再执行后面的线程
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}

class Thread01 extends Thread {
    public Thread01() {
    }

    public Thread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + "----》" + i);
            try {

                // Thread.sleep()
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}