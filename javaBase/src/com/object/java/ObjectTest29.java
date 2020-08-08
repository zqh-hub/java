package com.object.java;

/*
 * 代码块
 *  1、静态代码块：随着类的加载而执行（只加载一次）
 *         > 作用：初始化类的属性
 *         > 多个静态代码块，按照先后顺序
 *         > 静态代码块只能调用静态的属性，方法
 *  2、非静态代码块：随着对象的创建而执行（每造一个对象，都会执行）
 *         > 作用：可以再创建对象时，对对象的属性进行初始化
 *         > 非静态的可以调用静态的，也可非静态的
 * */
public class ObjectTest29 {
    public static void main(String[] args) {
        String de = Per.desc;
        Per per = new Per("蛮吉");
    }
}

class Per {
    private String name;
    static String desc = "是人";

    public Per() {

    }

    public Per(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        System.out.println("static Per");
    }

    {
        System.out.println("Per");
    }
}