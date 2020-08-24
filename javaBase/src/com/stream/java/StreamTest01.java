package com.stream.java;
/*
* Stream流
* > 生成流
* > 中间操作
* > 终结操作
*
* Collection体系的集合可以使用默认方法stream()生成流
* Map体系的集合间接生成
* 数组可以通过Stram接口的静态方法of生成
* */
import java.util.*;
import java.util.stream.Stream;

public class StreamTest01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Stream<String> stream = arr.stream();

        HashSet<Object> sets = new HashSet<>();
        Stream<Object> s2 = sets.stream();

        HashMap<Object, Object> map = new HashMap<>();
        Set<Object> keys = map.keySet();
        Stream<Object> s3 = keys.stream();
        Stream<Object> s4 = map.values().stream();
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Stream<Map.Entry<Object, Object>> s5 = entries.stream();

        String[] strs = {"12","34"};
        Stream<String> s6 = Stream.of(strs);

    }
}
