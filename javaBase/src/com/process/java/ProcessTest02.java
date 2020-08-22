package com.process.java;

import org.junit.Test;

/* 线程的优先级
 * 线程有两种调度模型：分时调度、抢占式调度模型（java）
 * */
public class ProcessTest02 {
    @Test
    public void test01() {
        MyThread m1 = new MyThread("线程1：");
        MyThread m2 = new MyThread("线程2：");
        MyThread m3 = new MyThread("线程3：");

        // 获取线程的优先级(默认：5)
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
        System.out.println(m3.getPriority());

        // 设置优先级
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(Thread.NORM_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
    }
}

