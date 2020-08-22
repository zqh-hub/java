package com.process.java;
/*
* 设置守护线程
* */
public class ProcessTest04 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01("线程1");
        Thread01 t2 = new Thread01("线程2");

        // 主线程
        Thread.currentThread().setName("主线程");

        // 守护线程
        t1.setDaemon(true);
        t1.setPriority(10);
        t2.setDaemon(true);
        t2.setPriority(10);

        t1.start();
        t2.start();

        // 主线程结束后，守护线程也应该随之结束
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"----》"+i);
        }
    }
}
