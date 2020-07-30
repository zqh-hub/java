package com.object.java;

public class ObjectTest08 {
}

class Girl {
    private String name;
    private int age;

    public Girl() {

    }

    public Girl(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        System.out.print("我想嫁" + boy.getName());
        boy.marry(this);
    }

    public void compare(Girl girl) {
        if (this.getAge() - girl.getAge() < 0) {
            System.out.print("我赢了");
        }
    }
}
