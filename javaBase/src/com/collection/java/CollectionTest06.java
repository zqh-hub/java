package com.collection.java;
/*
 * List
 * 1、|---Collection接口：单列集合，用来存储一个一个的对象
 *     |---List集合：存储有序的、可重复的数据
 *         |---ArrayList：作为List接口的主要实现类；线程不安全，效率高；底层使用Object[]存储
 *         |---LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高：底层使用双向链表存储
 *         |---Vector：作为List接口的古老实现类;线程安全，效率低；底层使用Object[]存储
 *
 * 2、面试题：ArrayList、LinkedList、Vector三者异同
 *  相同点：三个类都实现了List接口；存储数据的特点：存储有序的、可重复的
 *  不同：见上
 * 3、源码分析：
 *  ArrayList:
 *      |---jdk1.7
 *          new ArrayList();底层创建长度为10的Object[]数组elementData
 *          .add(xx);elementData[0] = new Integer(xx);
 *          ... ...
 *          .add(xx);如果elementData[]的容量不够则扩容，默认扩容原来的1.5倍，同时将元素复制到新的数组中
 *      |---jdk1.8
 *          new ArrayList();底层Object[]elementData初始化为{}，并没有创建创建长度为10的数组
 *          .add(xx);第一次调用add()后，才创建了长度为10的数组，并将数据添加到elementData中
 *          ... ...
 *          后续与1.7一致
 *  LinkedList:
 *          new LinkedList();内部声明了Node类型的first和last属性，默认为null
 *          .add(123);将123封装到Node中，创建了一个Node对象
 *
 *
 * */

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest06 {
    @Test
    public void test01() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);

        LinkedList<Object> obj = new LinkedList<>();
        obj.add(123);
    }
}
