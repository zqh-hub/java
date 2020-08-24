package com.functionInterface.java;

import java.util.function.Function;

/*
 * 常用函数式接口：Function<T,R>接口通常用于对参数进行处理，转换；然后返回新值
 *      > R apply(T t):将此函数应用于给定的参数
 *      > default <V> Function<T, V> andThen(Function after)
 * */
public class FunInterfaceTest10 {
    public static void main(String[] args) {
        convert("100", (s) -> Integer.parseInt(s));

        convert("200", Integer::parseInt, i -> String.valueOf(i + 2));
    }

    private static void convert(String s, Function<String, Integer> f) {
        int i = f.apply(s);
        System.out.println(i);
    }

    // 字符串转为int,再加一个术，再转化为字符串
    private static void convert(String s, Function<String, Integer> f1, Function<Integer, String> f2) {
        String apply = f1.andThen(f2).apply(s);
        System.out.println(apply);
    }
}
