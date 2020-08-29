package com.reflect.java;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
 * 反射获取构造方法
 * */
public class ReflectTest03 {
    @Test
    public void test01() throws ClassNotFoundException {
        Class<?> sc = Class.forName("com.reflect.java.Student");

        // getConstructors():获取公共的构造方法
        Constructor<?>[] cons = sc.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        // getDeclaredConstructors():获取所有的构造方法
        Constructor<?>[] dc = sc.getDeclaredConstructors();
        for (Constructor c : dc) {
            System.out.println(c);
        }
    }

    @Test
    public void test02() throws Exception {
        Class<?> sc = Class.forName("com.reflect.java.Student");
        //getConstructor():获取指定的公共构造方法
        Constructor<?> cs = sc.getConstructor();//无参构造器
        // newInstance():创建对象
        Object o = cs.newInstance();
        System.out.println(o);
        System.out.println(new Student());
    }
}
