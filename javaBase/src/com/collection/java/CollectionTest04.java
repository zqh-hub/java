package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * iterator
 * */
public class CollectionTest04 {
    @Test
    public void test01() {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(123);
        obj.add(new StringBuffer("456"));

        // 遍历

        Iterator<Object> iterator = obj.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // remove()
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if ("456".equals(next)) {
                iterator.remove();
            }
        }
    }
}
