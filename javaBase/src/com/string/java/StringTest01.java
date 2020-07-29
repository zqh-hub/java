package com.string.java;
/*
 * String的构造方法：
 *  1、使用new String(),每次new都会在栈创建一个新的对象
 *  2、使用“xx”,如果内容相同，指向的地址是一样的
 *
 * */

public class StringTest01 {
    public static void main(String[] args) {
        // 1、创建空白字符对象
        String str01 = new String();
        
        // 2、public String(char[] chs)
        char[] chs = {'a', 'b', 'c'};
        String str02 = new String(chs);

        // 3、public String(byte[] bys)
        byte[] bys = {97, 98, 99};
        String str03 = new String(bys);

        // 4、String str = "abc"
        String str04 = "abc";

        String str05 = "abc";
        System.out.println(str04);
        System.out.println(str05);
    }
}
