package com.reflect.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 获取成员变量
 *
 * */
public class ReflectTest05 {
    @Test
    public void test01() throws Exception {
        Class<?> c = Class.forName("com.reflect.java.Student");

        // getFields()：获取所有的公共成员变量
        Field[] fs = c.getFields();
        // getDeclaredFields():获取所有的成员变量
        Field[] dfs = c.getDeclaredFields();

        // getField():获取指定的公共成员变量
        Field f = c.getField("gender");
        // getDeclaredField():获取指定的成员变量
        Field df = c.getDeclaredField("name");
    }

    @Test
    public void test02() throws Exception {
        Class<?> c = Class.forName("com.reflect.java.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Field gender = c.getField("gender");

        //set(obj,value)
        gender.set(obj,"男");
        System.out.println(obj);
    }
}
