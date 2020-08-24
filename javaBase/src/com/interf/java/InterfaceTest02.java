package com.interf.java;

public class InterfaceTest02 {
    public static void main(String[] args) {
        Inter myInter = new MyInter();
        myInter.show01();
        myInter.show02();
        Inter.show03();
    }
}

interface Inter {
    void show01();

    default void show02() {
        System.out.println("show02");
    }

    // 静态方法
    static void show03() {
        System.out.println("show03");
    }
}

class MyInter implements Inter {

    @Override
    public void show01() {
        System.out.println("类 show01");
    }

    @Override
    public void show02() {
        System.out.println("类 show02");
    }
}