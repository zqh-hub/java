package com.reflect.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 获取方法
 * */
public class ReflectTest07 {
    @Test
    public void test01() throws Exception{
        Class<?> c = Class.forName("com.reflect.java.Student");

        // getMethods():获取所有的公共方法，包括继承的
        Method[] methods = c.getMethods();
        // getDeclaredMethods():获取所有的方法
        Method[] dms = c.getDeclaredMethods();

        // getMethod(方法名):获取指定的方法
        Method m01 = c.getMethod("m01");
        Method fun = c.getDeclaredMethod("fun");

        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        // invoke(对象,参数类型.class)
        m01.invoke(o);
        fun.setAccessible(true);
        fun.invoke(o);

        // 有返回值的方法
        Method m03 = c.getMethod("m03", String.class, int.class);
        Object www = m03.invoke(o, "www", 22);
        System.out.println(www);
    }
}
