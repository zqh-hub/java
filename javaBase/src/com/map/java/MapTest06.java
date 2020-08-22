package com.map.java;

import org.junit.Test;

import java.util.*;

import static java.util.Collections.sort;

/*
 * Collections
 *
 * */
public class MapTest06 {
    @Test
    public void test01() {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(123);
        obj.add("ggo");
        obj.add(true);
        obj.add(123);
        System.out.println(obj);//[123, ggo]

        // reverse(list):反转
        Collections.reverse(obj);
        System.out.println(obj);//[ggo, 123]

        // shuffle(list):随机化处理
        Collections.shuffle(obj);
        System.out.println(obj);//顺序随机输出

        //swap(list,index1,index2)
        Collections.swap(obj, 2, 0);
        System.out.println(obj);//[true, 123, ggo]

        // frequency(Collection, value):value出现几次
        int frequency = Collections.frequency(obj, 123);
        System.out.println(frequency);

        // synchronizedList(list):转为为安全的
        List<Object> objects = Collections.synchronizedList(obj);
    }

    @Test
    public void test02() {
        ArrayList<Object> src = new ArrayList<>();
        src.add(123);
        src.add(456);
        src.add(789);

        // copy(dest,src)
        List<Object> dest = Arrays.asList(new Object[src.size()]);
        Collections.copy(dest, src);
        System.out.println(dest);
    }
}

