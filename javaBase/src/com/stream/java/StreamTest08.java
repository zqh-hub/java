package com.stream.java;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 收集操作
 * public static <T> Collector toList():把元素收集到List集合中
 * public static <T> Collector toSet():把元素收集到Set集合中
 * public static <T> Collector toMap(Function keyMapper,Function valueMap):把元素收集到Map集合中
 *
 * */
public class StreamTest08 {
    public static void main(String[] args) {
        ArrayList<String> o1 = new ArrayList<String>();
        o1.add("蛮大人");
        o1.add("蛮小满");
        o1.add("蛮吉");

        // 3个字的
        Stream<String> len = o1.stream().filter(s -> s.length() == 3);

        // 把数据收集到List集合中
        List<String> list = len.collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }

        ArrayList<String> o2 = new ArrayList<String>();
        o2.add("1");
        o2.add("2");
        o2.add("3");
        // 前2个
        Stream<String> limit = o2.stream().limit(2);
        Set<String> set = limit.collect(Collectors.toSet());
        for (String s : set) {
            System.out.println(s);
        }

        String[] strs = {"a,12", "b,13"};
        Stream<String> stream = Stream.of(strs);
        Map<String, Integer> map = stream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + "," + next.getValue());
        }

    }
}
