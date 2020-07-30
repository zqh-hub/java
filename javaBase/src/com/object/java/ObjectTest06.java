package com.object.java;

/*
 * 权限修饰符：private、缺省、protected、public
 * 1、权限修饰符可以修饰：属性、方法、构造器、内部类
 * 2、类只能是public、缺省
 *
 * 属性赋值的先后顺序
 *  默认-->显示初始化-->构造器-->对象.方法/.属性
 * */
public class ObjectTest06 {
    private int age;
    String name;
    public String gender;

    private void saySorry() {
        System.out.print("say sorry");
    }

    void sayThank() {
        System.out.print("say thank");
    }

    public void sayFk() {
        System.out.print("stop");
    }
}

