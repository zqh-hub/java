package com.string.java;

import org.junit.Test;

/*
 * String:不可变；底层使用char[]存储
 * StringBuffer:可变；线程安全，效率低；底层使用char[]存储
 * StringBuild:可变；线程不安全，效率高；底层使用char[]存储
 * */
public class StringTest07 {
    @Test
    public void test01() {
        StringBuffer buffer = new StringBuffer();

        //append()
        buffer.append("abc");
        buffer.append("1");
        System.out.println(buffer);

        //String delete()
        StringBuffer delete = buffer.delete(2, 4);
        System.out.println(delete);
        System.out.println(buffer);

        //String replace()
        StringBuffer replace = buffer.replace(0, 2, "abcdefg");
        System.out.println(buffer);

        //insert()
        buffer.insert(0, 123);
        System.out.println(buffer);

        // reverse()
        StringBuffer reverse = buffer.reverse();
        System.out.println(buffer);

        // indexOf()
        int a = buffer.indexOf("a");
        System.out.println(a);

        //String substring()
        String substring = buffer.substring(2, 6);
        System.out.println(substring);
        System.out.println(buffer);

        //setCharAt
        buffer.setCharAt(0, 'v');
        System.out.println(buffer);

        // charAt()
        char c = buffer.charAt(3);
        System.out.println(c);
    }
}
