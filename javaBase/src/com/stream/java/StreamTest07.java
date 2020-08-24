package com.stream.java;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 综合练习
 * */
public class StreamTest07 {
    public static void main(String[] args) {
        ArrayList<String> o1 = new ArrayList<String>();
        o1.add("男1");
        o1.add("男2");
        o1.add("男3");
        o1.add("男4");
        o1.add("男5");
        o1.add("男6");

        ArrayList<String> o2 = new ArrayList<String>();
        o2.add("女1");
        o2.add("女2");
        o2.add("女3");
        o2.add("女4");
        o2.add("1女5");
        o2.add("1女6");

        // 男名字长度2，前三
        Stream<String> m = o1.stream().filter(s -> s.length() == 2).limit(3);

        // 女姓1，不要第一个
        Stream<String> w = o2.stream().filter(s -> s.startsWith("1")).skip(1);

        // 合并

        Stream<String> concat = Stream.concat(m, w);

        // 把上一步的元素作为构造方法的参数
        concat.map(Actor::new).forEach(System.out::println);
    }
}

class Actor {
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}