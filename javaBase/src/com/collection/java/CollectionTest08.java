package com.collection.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

/*
* 注意：
*   > 向Set中添加的数据，一定要重写equals()和hashCode();
*   > 重写的hashCode()和equals()方法要求一致
* 1、Set接口的框架
*   |---Collection接口：单列接口，用来存储一个一个的对象
*       |---Set接口：存储无序的、不可重复的数据
*           |---HashSet：作为Set接口的主要实现类；线程不安全；可以存储null值
*               |---LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
*           |---TreeSet:红黑树；可以按照添加对象的指定属性进行排序
*
* 2、理解无序、不可重复
*   > 无序性：不等于随机性。存储的数据在底层数据中并非按照索引的顺序添加，而是根据数据的hash
*   > 不可重复性：保证添加的元素按照equals()判断时，不能返回true
*
* 3、HashSet添加元素的过程：
*       向HashSet添加元素a,首先调用a所在类的hashCode方法，计算a的哈希值，
*   此hash值接着通过某种算法计算出在HashSet底层数组中的存放位置（即索引位置），
*   再判断该位置是否已经存在元素
*       > 如果没有，则添加成功
*       > 如果有其他元素b,c等，比较a与b的hash值
*               > 如果a与b的哈希值不同，则添加成功
*               > 如果不同，进而调用a的equals（）方法与b比较
*                       > 如果equals()方法返回true,则添加失败
*                       > 如果返回false,添加成功
* */
public class CollectionTest08 {
    @Test
    public void test(){
        HashSet<Object> objects = new HashSet<>();
    }
}

class Pp{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pp pp = (Pp) o;
        return age == pp.age &&
                name.equals(pp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}