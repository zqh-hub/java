package com.string.java;

import org.junit.Test;


// 常用方法
public class StringTest04 {
    @Test
    public void test01() {
        String str = "helloWorld";
        int length = str.length();

        // int length()
        System.out.println(length);

        // char charAt()
        char c = str.charAt(9);
        System.out.println(c);

        // boolean isEmpty()
        boolean empty = str.isEmpty();
        System.out.println(empty);
        // String toUpperCase()/toLowerCase()
        String s = str.toUpperCase();
        System.out.println(s);
    }

    @Test
    public void test02() {
        String str = "jo  jo ";

        //String trim()
        String trim = str.trim();
        System.out.println(trim);

        // equals
        boolean equals = "123".equals("123");
        System.out.println(equals);

        // int compareTo()
        int i = str.compareTo("co co ");
        System.out.println(i);

        // String substring()
        String substring = str.substring(0, 2);
        System.out.println(substring);
    }

    @Test
    public void test03() {
        String str = "hello";

        // boolean endsWith()/startWith()
        boolean h = str.endsWith("o");
        System.out.println(h);

        // boolean startsWith(str,startIndex)
        boolean e = str.startsWith("e", 1);
        System.out.println(e);

        // boolean contains()
        boolean e1 = str.contains("e");
        System.out.println(e1);

        // int indexOf()
        int l = str.indexOf("l",4);
        System.out.println(l);

        int l1 = str.lastIndexOf("l", 2);
        System.out.println(l1);
    }
}
