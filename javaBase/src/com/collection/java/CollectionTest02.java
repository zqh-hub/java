package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest02 {
    @Test
    public void test01() {
        Collection col = new ArrayList();
        col.add("ABC");
        col.add(123);
        col.add(false);

        // contains(Object obj):判断是否包含obj。只通过值判断，不看地址（需要重写equals）
        boolean res = col.contains("ABC");
        System.out.println(res);

        // remove(Object obj):移除obj
        col.remove("ABC");
        System.out.println(col);

        // removeAll(Collection col):将与col的交集删除掉，保留col中没有的
        Collection col2 = new ArrayList();
        col2.add(false);
        col2.add(12);

        col.removeAll(col2);
        System.out.println(col);

        //retainAll(Collection col):保留与col的交集
        List<Integer> integers = Arrays.asList(123, 456);
        col.retainAll(integers);
        System.out.println(col);
    }

    @Test
    public void test02(){
        Collection col = new ArrayList();
        col.add("ABC");
        col.add(123);
        col.add(false);

        Collection col2 = new ArrayList();
        col.add("ABC");
        col.add(123);
        col.add(false);

        //equals():只看元素，不看地址
        boolean equals = col.equals(col2);
        System.out.println(equals);
    }
}
