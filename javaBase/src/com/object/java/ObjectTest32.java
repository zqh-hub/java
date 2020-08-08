package com.object.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * 模板设计模式
 * */
public class ObjectTest32 {
    public static void main(String[] args) {
        subTemplate subTemplate = new subTemplate();
        subTemplate.speedTime();
    }
}

abstract class Template {
    public void speedTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("时间:" + time);

    }

    public abstract void code();
}

class subTemplate extends Template {

    @Override
    public void code() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}