package com.map.java;

import org.junit.Test;

import java.util.HashMap;

public class MapTest02 {
    @Test
    public void test01() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        // put()---->添加
        hashMap.put("a", 1);
        hashMap.put("b", 2);

        // put()---->修改
        hashMap.put("a", 3);
        System.out.println(hashMap); //{a=3, b=2}

        HashMap<Object, Object> map = new HashMap<>();
        map.put("c", 4);
        map.put("d", 5);

        //putAll()
        hashMap.putAll(map);
        System.out.println(hashMap); // {a=3, b=2, c=4, d=5}

        //remove(key)
        hashMap.remove("d");
        System.out.println(hashMap); // {a=3, b=2, c=4}

        // clear():并不会使map = null
        hashMap.clear();
        System.out.println(hashMap); // {}

        // size()
        int size = hashMap.size();
        System.out.println(size); // 0
    }

    @Test
    public void test02() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);

        //get(key)
        Object a = hashMap.get("a");
        System.out.println(a); // 1

        //containsKey(key)
        boolean b = hashMap.containsKey("b");
        System.out.println(b); // true

        // containsValue(value):如果有多个相同的value,发现第一个就返回true
        boolean b1 = hashMap.containsValue(1);
        System.out.println(b1); //true

        // isEmpty()
        boolean empty = hashMap.isEmpty();
        System.out.println(empty); // false

        // equals
        HashMap<Object, Object> hashMap2 = new HashMap<>();
        hashMap2.put("a", 1);
        hashMap2.put("b", 2);

        boolean equals = hashMap.equals(hashMap2);
        System.out.println(equals); // true
    }
}
