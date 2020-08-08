package com.string.java;

import org.junit.Test;

import java.util.Arrays;

// 常用方法
public class StringTest05 {
    @Test
    public void test01(){
        String str = "不要靠近";

        // String replace()
        String r = str.replace("不", "");
        System.out.println(r);

        String[] s = str.split("要");
        System.out.println(Arrays.toString(s));
    }
}
