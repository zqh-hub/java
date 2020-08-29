package com.annotation.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@My(className = "com.annotation.java.Per", method = "test01")
public class AnnotationTest02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<AnnotationTest02> c = AnnotationTest02.class;
        My an = c.getAnnotation(My.class);
        String s = an.className();
        String method = an.method();
        System.out.println(s);
        System.out.println(method);

        Class<?> aClass = Class.forName(s);
        Object obj = aClass.newInstance();
        Method method1 = aClass.getMethod(method);
        method1.invoke(obj);

    }
}

class Per {
    public void test01() {
        System.out.println("test01");
    }
}

@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface My {
    String className();

    String method();
}

