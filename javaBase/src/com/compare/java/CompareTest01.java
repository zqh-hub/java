package com.compare.java;

import org.junit.Test;

import java.util.Arrays;

/*
 * 比较器：
 *  1、comparable(自然排序)
 *      > String、包装类等重写了comparable接口，重写了compareTo()方法
 *      > 重写compareTo方法
 *  2、comparator(定制排序)
 * */
public class CompareTest01 {
    @Test
    public void test01() {
        Person[] people = new Person[3];
        people[0] = new Person("jojo",23);
        people[1] = new Person("coco",45);
        people[2] = new Person("gogo",20);

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person per = (Person) o;
            if (this.age < per.age) {
                return -1;
            } else if (this.age > per.age) {
                return 1;
            } else {
                return 0;
            }
        }

        throw new RuntimeException("类型不一致");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
