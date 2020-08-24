package com.functionInterface.java;

import java.util.function.Function;

public class FunInterfaceTest11 {
    public static void main(String[] args) {
        String s = "魁拔,1000";
        convert(s, (str) -> str.split(",")[1], Integer::parseInt, (i) -> i + 70);
        // 截取30
        // 30转化为int
        // +70
    }

    private static void convert(String s, Function<String, String> f1, Function<String, Integer> f2, Function<Integer, Integer> f3) {
        Integer apply = f1.andThen(f2).andThen(f3).apply(s);
        System.out.println(apply);
    }
}
