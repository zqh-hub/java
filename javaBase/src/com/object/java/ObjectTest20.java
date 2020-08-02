package com.object.java;

/*
 * 多态性
 * 编译期，只能调用父类中声明的方法；运行期，执行子类重写的方法
 * */
public class ObjectTest20 {
    public static void main(String[] args) {
        Person man = new Man();
        man.eat();
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("person eat");
    }
}

class Man extends Person {
    private String gender;

    @Override
    public void eat() {
        System.out.println("Man eat");
    }
    public void say(){
        System.out.println("Man say");
    }
}