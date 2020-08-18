package com.collection.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest03 {
    @Test
    public void test01(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("ABC");
        list.add(123);
        list.add(false);


        //hashCode():返回当前对象的hash
        System.out.println(list.hashCode());

        // toArray():集合转化为数组Array
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        
        //asList():数组转化为集合
        List<String> strings = Arrays.asList(new String[]{"c", "v", "b"});
        System.out.println(strings);
    }
}
