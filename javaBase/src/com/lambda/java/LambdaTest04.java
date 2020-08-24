package com.lambda.java;

/*
 * 省略模式：
 *   > 参数的类型可以省略,要省略都省略
 *   > 只有一个参数，可将()省略
 *   > 代码块中只有一个语句，可省略{}和；和 return
 * */
public class LambdaTest04 {
    public static void main(String[] args) {
        useAdd((x, y) -> x + y);
    }

    public static void useAdd(Add a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}

interface Add {
    int add(int x, int y);
}