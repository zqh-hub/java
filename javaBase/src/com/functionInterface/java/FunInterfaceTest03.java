package com.functionInterface.java;

import java.util.function.Supplier;

/*
 * 常用的函数式接口：Supplier<T>的get()方法
 *   > 该方法不需要传递参数，他会按照某种实现逻辑返回一个数据，
 *   > Supplier<T>接口也被成为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口
 *       就会生成该类型的数据
 * */
public class FunInterfaceTest03 {
    public static void main(String[] args) {
        String s = getString(() -> "jojo");
        System.out.println(s);
    }

    public static String getString(Supplier<String> s) {
        return s.get();
    }
}
