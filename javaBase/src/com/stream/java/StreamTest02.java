package com.stream.java;
/*
* filter()
* forEach()
* */
import java.util.ArrayList;

public class StreamTest02 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("魁拔");
        arr.add("离离艾");
        arr.add("魁拔2");

        // 把集合中以“魁”开头的元素在控制台输出
        arr.stream().filter((s)->s.startsWith("魁")).forEach(System.out::println);
        // 把长度是3的输出
        arr.stream().filter((s) -> s.length() == 3).forEach(System.out::println);

        // 以“魁”开头,长度是3的输出
        arr.stream().filter(s -> s.startsWith("魁")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
