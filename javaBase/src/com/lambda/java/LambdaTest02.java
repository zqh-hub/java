package com.lambda.java;

/*
 * 带参数
 * */
public class LambdaTest02 {
    public static void main(String[] args) {

        useFlyable((String s) -> {
            System.out.println(s);
        });
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });
    }

    public static void useFlyable(Flyable f) {
        f.fly("我飞");
    }
}

interface Flyable {
    void fly(String s);
}