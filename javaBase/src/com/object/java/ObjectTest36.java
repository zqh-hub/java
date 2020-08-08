package com.object.java;
/*
* jdk 1.8
* 1、接口中的静态方法只能接口调用
* 2、通过实现类的对象，可以调用接口中的默认方法
* 3、如果实现类实现了多个接口，并且接口之间有同名同参的方法---->报错
* */
public class ObjectTest36 {
    public static void main(String[] args) {
        Sub sub = new Sub();

    }
}

interface Par{
    static void say(){
        System.out.println("say");
    }

    default void eat(){
        System.out.println("eat");
    }
}

class Sub implements Par{

}