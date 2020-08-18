package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 1、数组在存储多个数据方面的缺点：
 *   > 一旦初始化以后，其长度不可改变
 *   > 数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便
 *   > 获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 *   > 数组存储数据的特点：有序、可重复。对于无需、不可重复的需求，不能满足
 *
 * 2、集合框架：
 *   |---Collection接口：单列集合，用来存储一个一个的对象
 *       |---List接口：存储有序的、可重复的数据
 *           |---ArrayList、LinkedList、Vector
 *
 *       |---Set接口：存储无序的、不可重复的数据
 *           |---HashSet、LinkedHashSet、TreeSet
 *
 *   |---Map接口：双列集合，用来存储一对一对（key,value）的数据
 * */
public class CollectionTest01 {
    @Test
    public void test01() {
        Collection obj = new ArrayList();

        // add(Object e):添加
        obj.add("AA");
        obj.add(123);

        // size():获取元素的个数
        int size = obj.size();
        System.out.println(size);

        //addAll(Collection col):添加一个集合
        Collection col = new ArrayList();
        col.add("vv");
        col.add(true);

        obj.addAll(col);
        System.out.println(obj);

        // clear():清空数据
        obj.clear();

        //isEmpty():判断是否为空
        boolean empty = obj.isEmpty();
    }
}
