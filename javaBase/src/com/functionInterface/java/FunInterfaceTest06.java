package com.functionInterface.java;

import java.util.function.Consumer;

/*
 * 练习：Consumer
 * */
public class FunInterfaceTest06 {
    public static void main(String[] args) {
        String[] s = new String[]{"k,90", "g,20"};
        print(s, (str) -> {
            String key = str.split(",")[0];
            System.out.print("姓名：" + key);
        }, (str) -> {
            String value = str.split(",")[1];
            System.out.print(",年龄：" + value+"\n");
        });
    }

    public static void print(String[] s, Consumer<String> c, Consumer<String> cc) {
        for (String str : s) {
            c.andThen(cc).accept(str);
        }
    }
}
