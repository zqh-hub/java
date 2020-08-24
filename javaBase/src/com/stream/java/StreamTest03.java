package com.stream.java;
/*
* limit()
* skip()
* */
import java.util.ArrayList;

public class StreamTest03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("魁拔");
        arr.add("离离艾");
        arr.add("魁拔2");

        //前2个，输出
        arr.stream().limit(2).forEach(System.out::println);
        // 跳过前2个，
        arr.stream().skip(2).forEach(System.out::println);
        // 先跳过1个，把剩下的前一个输出
        arr.stream().skip(1).limit(1).forEach(System.out::println);
    }
}
