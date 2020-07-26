package com.object.java;

/*
 * 一、重载
 * 参数类型和参数个数不同，形参顺序不同也是重载
 * 一个有返回值，一个没有也不是重载
 *
 * 二、可变个数形参
 *  1、格式：(数据类型 ... 形参名)
 *  2、注意：这两个不能构成重在
 *      public void show(String[] strs){}
 *      public void show(String ... strs){}
 *  3、可变个数形参只能声明在末尾
 *      public void show(int xx,double yy, String... args){}
 * */
public class ObjectTest03 {
    public static void main(String[] args) {
        ObjectTest03 obj = new ObjectTest03();
        obj.getStr("koko", "coco");
    }

    public void getStr(String... args) {
        System.out.println(args[0]);
    }
}
