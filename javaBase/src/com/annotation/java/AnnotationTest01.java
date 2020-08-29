package com.annotation.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * java注解
 *  自定义注解
 *  @Target:注解的作用范围
 *      TYPE:可以作用与类
 *      METHOD:方法
 *      FIELD:成员变量
 *  @Retention:描述注解被保留的阶段
 *
 * */

public class AnnotationTest01 {

}

@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnoation {
    int age() default 12;

    String name();

    An we();

    int[] ints();
}

@interface An {
    int aa() default 134;
}