package com.functionInterface.java;
/*
* 函数式接口作为形参
* */
public class FunInterfaceTest01 {
    public static void main(String[] args) {
        // startRunnable方式，以Runnable作为形参，使用Lambda：
        startRunnable(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        startRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
    }

    public static void startRunnable(Runnable r) {
        new Thread(r).start();
    }
}
