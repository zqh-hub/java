package com.object.java;

import org.junit.Test;

public class ObjectTest24 {
    // String转化为基本数据类型、包装类
    @Test
    public void testStringToBase(){
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);

        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }

    // 基本数据类型转化为String
    @Test
    public void testBaseToString(){
        int num = 10;
        // 方式1：+
        String str = num + "";
        // 方式2：valueOf
        String numStr = String.valueOf(num);

    }
    // 自动装箱与拆箱
    @Test
    public void testAuto(){
        int num01 = 10;
        Integer num01Int = num01;

        Integer integer = 30;
        int i = integer;
    }
    // 包装类转化为基本数据类型
    @Test
    public void testWrapToBase(){
        Integer integer = new Integer(20);
        int i = integer.intValue();
    }
    //基本数据类型转化为包装类
    @Test
    public void testBaseToWrap() {
        int num = 10;
        Integer numInt = new Integer(num);
        System.out.println(numInt.toString());

        String str = "23";
        Integer strInt = new Integer(str);
        System.out.println(strInt);
    }
}
