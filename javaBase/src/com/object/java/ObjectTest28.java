package com.object.java;
/*
* 单例模式
* */
public class ObjectTest28 {
}

// 饿汉式
class Ban{
    private Ban(){

    }

    private static Ban instance = new Ban();

    public static Ban getInstance(){
        return instance;
    }
}

//懒汉式
class Order{
    private Order(){

    }

    private static Order instance = null;

    private static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}