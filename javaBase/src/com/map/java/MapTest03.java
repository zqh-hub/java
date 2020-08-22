package com.map.java;

import org.junit.Test;

import java.util.*;

public class MapTest03 {
    @Test
    public void test() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);

        // 遍历key
        Set<Object> keys = hashMap.keySet();
        Iterator<Object> iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        // 遍历value
        Collection<Object> values = hashMap.values();
        for (Object obj : values) {
            System.out.println(obj);
        }

        //
        Set<Map.Entry<Object, Object>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Object, Object>> its = entries.iterator();
        while (its.hasNext()) {
            Object next = its.next();
            Map.Entry entry = (Map.Entry) next;
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }

    }
}
