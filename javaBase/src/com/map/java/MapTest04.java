package com.map.java;
/*
 * TreeMap
 *   1、自然排序，定制排序
 * */

import org.junit.Test;

import java.util.*;

public class MapTest04 {
    @Test
    public void test01() {
        TreeMap<Object, Object> treeMap = new TreeMap<>();
        treeMap.put(new Dog("co", 12), 45);
        treeMap.put(new Dog("do", 14), 56);
        treeMap.put(new Dog("go", 10), 23);
        treeMap.put(new Dog("jo", 21), 13);

        Set<Map.Entry<Object, Object>> entries = treeMap.entrySet();
        Iterator<Map.Entry<Object, Object>> its = entries.iterator();
        while (its.hasNext()) {
            Map.Entry<Object, Object> next = its.next();
            System.out.println(next.getKey() + "," + next.getValue());
        }
    }

    @Test
    public void test02() {
        Comparator<Object> objectComparator = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Dog && o2 instanceof Dog) {
                    Dog o11 = (Dog) o1;
                    Dog o21 = (Dog) o2;

                    return o11.getName().compareTo(o21.getName());
                }
                throw new RuntimeException("类型不一致");
            }
        };
        TreeMap<Object, Object> map = new TreeMap<>(objectComparator);
        map.put(new Dog("co", 12), 45);
        map.put(new Dog("so", 14), 56);
        map.put(new Dog("go", 10), 23);
        map.put(new Dog("jo", 21), 13);

        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Iterator<Map.Entry<Object, Object>> its = entries.iterator();
        while (its.hasNext()) {
            Map.Entry<Object, Object> next = its.next();
            System.out.println(next.getKey() + "," + next.getValue());
        }

    }

}

class Dog implements Comparable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Dog) {
            Dog d1 = (Dog) o;
            if (d1.getAge() > this.getAge()) {
                return 1;
            } else if (d1.getAge() < this.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("类型错误");
    }
}