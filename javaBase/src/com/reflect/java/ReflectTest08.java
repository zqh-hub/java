package com.reflect.java;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 越过泛型检查
 * */
public class ReflectTest08 {
    @Test
    public void test01() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Class<? extends ArrayList> c = list.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(list,12);
        add.invoke(list, "123");
        System.out.println(list);
    }
}
