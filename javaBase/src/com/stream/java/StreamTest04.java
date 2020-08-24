package com.stream.java;
/*
 * concat()
 * distinct()
 * */

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kuiba01");
        arr.add("kuiba02");
        arr.add("kuiba03");
        arr.add("kuiba04");

        // 取前3个，组成一个流
        Stream<String> s1 = arr.stream().limit(3);

        // 跳过2个，组成一个流
        Stream<String> s2 = arr.stream().skip(2);

        // 合并s1和s2，并输出
        // Stream.concat(s1, s2).forEach(System.out::println);

        // 合并s1和s2，不能重复

        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
