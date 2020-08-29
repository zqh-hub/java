package com.reflect.java;
/*
 * 练习
 * */

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectTest06 {
    @Test
    public void test01() throws Exception {
        Class<?> c = Class.forName("com.reflect.java.Student");
        Constructor<?> cs = c.getConstructor();
        Object o = cs.newInstance();
        Field gender = c.getField("gender");
        Field name = c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");

        //setAccessible(true)
        name.setAccessible(true);
        gender.set(o, "女");
        name.set(o, "离离艾");
        age.set(o, 12);
        System.out.println(o);
    }
}
