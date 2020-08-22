package com.collection.java;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionTest10 {
    @Test
    public void test01() {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Mine && o2 instanceof Mine) {
                    Mine m1 = (Mine) o1;
                    Mine m2 = (Mine) o2;
                    return Integer.compare(m1.getAge(), m2.getAge());
                }
                throw new RuntimeException("类型错误");
            }
        };

        TreeSet<Object> objects = new TreeSet<>(com);
        objects.add(new Mine(12, "co"));
        objects.add(new Mine(10, "jo"));
        objects.add(new Mine(11, "ko"));
        objects.add(new Mine(90, "xo"));

        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}

class Mine {
    private int age;
    private String name;

    public Mine() {
    }

    public Mine(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "My{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
