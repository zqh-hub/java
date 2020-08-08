package com.object.java;

/*
 * == 与 equals
 * ==:
 *   1、基本数据类型比较的是值
 *   2、引用数据类型比较的是地址值
 * equals:
 *   只适用于引用数据类型
 * */
public class ObjectTest23 {
    public static void main(String[] args) {
        Phone honor = new Phone("honor", 23);
        System.out.println(honor);
    }
}

class Phone {
    private String name;
    private int age;

    public Phone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Phone) {
            Phone o = (Phone) obj;
            if (this.age == o.age && this.name.equals(o.name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}