package com.lambda.java;

/*
 * 带参有返回值
 * */
public class LambdaTest03 {
    public static void main(String[] args) {

        useAddable((int x, int y) -> {
            return x + y;
        });

        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}

interface Addable {
    int add(int x, int y);
}
