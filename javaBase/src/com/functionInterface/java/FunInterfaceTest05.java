package com.functionInterface.java;

import java.util.function.Consumer;

/*
 * 常用函数式接口：Consumer<T>
 *  > void accept(T t):对给定的参数进行操作
 *  > Consumer<T> addThen
 * */
public class FunInterfaceTest05 {
    public static void main(String[] args) {
        operatorString("魁拔", (s) -> System.out.println(s));
        operatorString("魁拔", System.out::println);

        // 两次消费s
        operatorTwo("kuiba", (s) -> System.out.println(s), (s) -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    public static void operatorString(String s, Consumer<String> c) {
        c.accept(s);
    }

    public static void operatorTwo(String s, Consumer<String> c, Consumer<String> cc) {
        c.accept(s);
        cc.accept(s);
        // andThen()
        c.andThen(cc).accept(s);
    }
}
