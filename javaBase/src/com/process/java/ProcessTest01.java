package com.process.java;

/*
 * 方式1：继承Thread,重写run方法,调用start()方法
 * */
public class ProcessTest01 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();

        MyThread m2 = new MyThread("线程2：");
        //setName
        m1.setName("线程1：");

        m1.start();
        m2.start();

        //查看main方法的线程名
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    public MyThread() {
    }

    // 带有线程名的构造方法
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 99; i++) {
            // getName()
            System.out.println(getName() + "---->" + i);
        }
    }
}
