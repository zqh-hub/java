package com.reflect.java;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件运行类中的方法
 * */
public class ReflectTest09 {
    @Test
    public void test01() throws Exception {
        // 加载配置文件
        Properties pro = new Properties();
        FileReader reader = new FileReader("D:\\document\\java\\javaBase\\src\\com\\reflect\\java\\class.text");
        pro.load(reader);
        reader.close();

        // 获取参数
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(o);
    }
}
