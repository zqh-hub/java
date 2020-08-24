package com.functionInterface.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 函数式接口作为方法的返回值
 * */
public class FunInterfaceTest02 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("jojo");
        strings.add("coco");
        strings.add("vovo");
        Collections.sort(strings);
        System.out.println(strings);

    }

    public static Comparator<String> getComparator() {
        // Lambda方式：函数式接口作为返回值
        return (s1, s2) -> s1.compareTo(s2);

        /*Comparator<String> com = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };
        return com;*/
    }
}
