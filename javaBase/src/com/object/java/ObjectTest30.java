package com.object.java;

/*
 * final
 * 1、可修饰类、方法、变量
 * 2、修饰方法，该方法不可被重写
 * 3、修饰类，不可被继承
 * 4、修饰变量，该变量成为常量
 *   4.1、final修饰属性，可显示赋值、代码块初始化、构造器中初始化
 *   4.2、final修饰局部变量，修饰方法体（常量）、修饰形参（常量）
 * static final:修饰属性（全局常量）
 * */
public class ObjectTest30 {
}

class ManJi {
    private ManJi() {

    }

    private static ManJi instance = new ManJi();

    public static ManJi getInstance() {
        return instance;
    }
}

class ManDaRen {
    private ManDaRen() {

    }

    private static ManDaRen instance = null;

    public static ManDaRen getInstance() {
        if (instance == null) {
            return new ManDaRen();
        }
        return instance;
    }
}
