package com.stream.java;
/*
* count()
* */
import java.util.ArrayList;

public class StreamTest06 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kuiba01000");
        arr.add("kuiba0400");
        arr.add("kuiba020");
        arr.add("liliai00");

        // 集合中的元素在控制台输出
        arr.stream().forEach(System.out::println);
        // 统计“k”开头的有几个
        long k = arr.stream().filter(s -> s.startsWith("k")).count();
        System.out.println(k);
    }
}
