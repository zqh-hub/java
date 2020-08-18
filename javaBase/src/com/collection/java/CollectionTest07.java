package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest07 {
    @Test
    public void test01() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);
        objects.add("45");
        objects.add(new StringBuffer("67"));

        // add(int index, Object obj)
        objects.add(2,10);
        System.out.println(objects);//[123, 45, 10, 67]

        // addAll(Collection col)
        List<Integer> integers = Arrays.asList(40, 41);
        objects.addAll(integers);
        System.out.println(objects);//[123, 45, 10, 67, 40, 41]

        // get(int index)
        Object o = objects.get(3);
        System.out.println(o);//67

        // indexOf/lastIndexOf(Object obj):obj第一次出现的位置
        int i = objects.indexOf(123);
        System.out.println(i);//0

        // remove(int index)
        Object remove = objects.remove(2);
        System.out.println(remove);//删除的是：10
        System.out.println(objects);//[123, 45, 67, 40, 41]

        // set(int index, Object obj):修改指定位置的值
        Object aNew = objects.set(0, "new");
        System.out.println(aNew);// 123
        System.out.println(objects);// [new, 45, 67, 40, 41]

        // subList(int startIndex,int endIndex)
        List<Object> objects1 = objects.subList(0, 4);
        System.out.println(objects1);// [new, 45, 67, 40]
        System.out.println(objects);// [new, 45, 67, 40, 41]
    }
}
