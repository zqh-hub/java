package com.lambda.java;

/*
 * 一个接口，并且这个接口有且只有一个抽象方法
 * 练习1：
 * */
public class LambdaTest01 {
    public static void main(String[] args) {
        useEatable(() -> System.out.println("就知道吃吃"));

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("就知道吃");
            }
        });
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }
}

interface Eatable {
    void eat();
}

class Eat implements Eatable {

    @Override
    public void eat() {
        System.out.println("吃");
    }
}