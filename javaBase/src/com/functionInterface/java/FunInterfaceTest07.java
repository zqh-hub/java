package com.functionInterface.java;

import java.util.function.Predicate;

/*
 * 常用函数式接口：Predicate<T>接口通常用于判断参数是否满足指定条件
 *   > boolean test(T t):对给定的参数进行判断（判断逻辑由Lambda表达式实现）
 *   > default Predicate<T> negate():返回一个逻辑的否定，对于逻辑非
 *   > default Predicate<t> and(Predicate other):返回一个组合判断，对应短路与
 *   > default Predicate<t> or(Predicate other):返回一个组合判断，对应短路或
 * */
public class FunInterfaceTest07 {
    public static void main(String[] args) {
        boolean len = checkString("jojo", (s) -> s.length() > 8);
        System.out.println(len);
    }

    public static boolean checkString(String s, Predicate<String> p) {
        return p.test(s);

        // 逻辑非
        // return !p.test(s);
        // return p.negate().test(s);
    }
}
