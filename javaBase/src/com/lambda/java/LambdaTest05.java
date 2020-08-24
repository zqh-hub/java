package com.lambda.java;


public class LambdaTest05 {
    public static void main(String[] args) {
        useInter(() -> System.out.println("ko"));

        useStudent(new Student() {
            @Override
            public void study() {
                System.out.println("不学习");
            }
        });
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("动物");
            }
        });
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("数字");
            }
        });
    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}

interface Inter {
    void show();
}

abstract class Animal {
    public abstract void method();
}

class Student {
    public void study() {
        System.out.println("学习");
    }
}