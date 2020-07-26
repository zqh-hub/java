package com.object.java;
/*
 * 
 *
 * */

public class ObjectTest01 {
    public static void main(String[] args) {
        Persion per = new Persion();
        per.isMale = "男";
        per.getGender();
        per.getAge();
    }
}

class Persion {
    String name;
    int age = 1;
    String isMale;

    public void getName() {
        System.out.println("我的名字是" + name);
    }

    public void getAge() {
        System.out.println("我的年龄是" + age);
    }

    public void getGender() {
        System.out.println("我的性别：" + isMale);
    }
}
