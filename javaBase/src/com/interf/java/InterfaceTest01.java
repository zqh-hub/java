package com.interf.java;

/*
 * 接口的组成
 *   > 常量 public static final
 *   > 抽象方法 public abstract
 *   > 默认方法：因为实现类要重写接口的所有方法，这就使的每次需要给接口新增抽象方法，
 *          实现类就要改变，很是麻烦，所以新增默认方法
 *   > 静态方法
 *   > 私有方法
 * */
public class InterfaceTest01 {
    public static void main(String[] args) {
        MyInterface myOne = new MyOne();
        myOne.show1();
        myOne.show2();
        myOne.show3();
    }
}

interface MyInterface {
    void show1();

    void show2();

    // 默认方法
    default void show3() {
        System.out.println("默认");
    }
}


class MyOne implements MyInterface {

    @Override
    public void show1() {
        System.out.println("One show1");
    }

    @Override
    public void show2() {
        System.out.println("One show2");
    }

    @Override
    public void show3() {
        System.out.println("重写 show3");
    }
}