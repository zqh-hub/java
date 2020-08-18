package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;

/*
 * foreach
 * */
public class CollectionTest05 {
    @Test
    public void test01() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(123);
        objects.add("456");
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    @Test
    public void test02() {
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
