package com.string.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String 与 char[] 的转换
 * String 与 byte[] 的转换
 * */
public class StringTest06 {
    @Test
    public void test01() {
        String str = "jojo";

        //char[] toCharArray()
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        char[] ch = new char[]{'g', 'h', 'j'};
        String string = new String(ch);
        System.out.println(string);
    }

    @Test
    public void test02() throws UnsupportedEncodingException {
        String str = "coco汉";
        // byte[] getBytes()
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

    }
}
