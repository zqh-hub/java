package com.process.java;

/*
 * 方法2：实现Runnable接口
 * */
public class ProcessTest05 {
    public static void main(String[] args) {
        Thread02 th = new Thread02();

        Thread t1 = new Thread(th,"线程1");
        Thread t2 = new Thread(th,"线程2");

        t1.start();
        t2.start();

    }
}

class Thread02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "---》" + i);
        }
    }
}