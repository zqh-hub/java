package com.collection.java;
/*
 * TreeSet:
 *   1、向TreeSet中添加的元素数据必须都是相同的类
 *   2、自定义对象：定制排序、自然排序
 *   3、自然排序中，TreeSet不在象HashSet按照equals()进行判断两个数据是否一样，而是根据compareTo()进行判断
 *   4、定制排序中，TreeSet根据compare()进行判断
 * */

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest09 {
    @Test
    public void test01() {
        TreeSet<Object> obj = new TreeSet<>();
        obj.add(12);
        obj.add(3);
        obj.add(-98);
        obj.add(0);

        Iterator<Object> iterator = obj.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 自定义类
    @Test
    public void test02(){
        TreeSet<Object> objects = new TreeSet<>();
        objects.add(new My(12,"co"));
        objects.add(new My(10,"jo"));
        objects.add(new My(11,"ko"));
        objects.add(new My(11,"xo"));

        for (Object obj:objects) {
            System.out.println(obj);
        }
    }
}

class My implements Comparable {
    private int age;
    private String name;

    public My() {
    }

    public My(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "My{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof My){
            My obj = (My)o;
            if (obj.age > this.age){
                return 1;
            }else if (obj.age < this.age){
                return -1;
            }else {
                return this.name.compareTo(obj.name);
            }
        }
        throw new RuntimeException("传入类型错误");
    }
}
