package com.reflect.java;
/*
 * 练习
 * */

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectTest04 {
    @Test
    public void test01() throws Exception {
        // 公共有参
        Class<?> c = Class.forName("com.reflect.java.Student");
        Constructor<?> cs = c.getConstructor(String.class, int.class, String.class);
        Object o1 = cs.newInstance("小明", 12, "n");
        System.out.println(o1);
    }

    @Test
    public void test02() throws Exception {
        // 私有有参
        Class<?> c = Class.forName("com.reflect.java.Student");
        Constructor<?> dcs = c.getDeclaredConstructor(String.class);

        // setAccessible(boolean bool):取消检查
        dcs.setAccessible(true);
        Object obj = dcs.newInstance("小小");
        System.out.println(obj);
    }
}
