package com.method.java;

/*
 * 引用方法
 *
 * */
public class MethodTest01 {
    public static void main(String[] args) {

        //usePrintable(s -> Integer.parseInt(s));

        // 方法引用::
        usePrintable(Integer::parseInt);
    }

    private static void usePrintable(Printable p) {
        int text = p.printString("1");
        System.out.println(text);
    }
}

interface Printable {
    int printString(String s);
}