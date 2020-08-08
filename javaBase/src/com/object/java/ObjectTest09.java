package com.object.java;

public class ObjectTest09 {
    public static void main(String[] args) {
        Boy boy = new Boy("boy1", 23);
        Girl girl = new Girl("girl1", 21);
        girl.marry(boy);

        Girl girl2 = new Girl("girl2", 23);
        girl.compare(girl2);
    }

}

class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name, int age) {
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

    public void marry(Girl girl) {
        System.out.print("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.getAge() >= 22) {
            System.out.print("合法");
        } else {
            System.out.print("不合法");
        }
    }
}
