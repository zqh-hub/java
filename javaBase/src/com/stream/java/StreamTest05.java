package com.stream.java;
/*
 * sorted():自然排序
 * */

import java.util.ArrayList;

public class StreamTest05 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kuiba01000");
        arr.add("kuiba0400");
        arr.add("kuiba020");
        arr.add("kuiba00");

        // 自然排序
        // arr.stream().sorted().forEach(System.out::println);

        // 定制排序
        arr.stream().sorted((o1, o2) -> Integer.compare(o1.length(), o2.length())).forEach(System.out::println);
    }
}
