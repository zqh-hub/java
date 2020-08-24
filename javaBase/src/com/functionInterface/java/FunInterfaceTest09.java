package com.functionInterface.java;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunInterfaceTest09 {
    public static void main(String[] args) {
        String[] strs = {"kk,39", "jojo,50"};
        ArrayList<String> ss = check(strs, (str) -> {
            return str.split(",")[0].length() > 2;
        }, (str) -> {
            return Integer.parseInt(str.split(",")[1]) > 30;
        });

        for (String s : ss) {
            System.out.println(s.toString());
        }
    }

    public static ArrayList<String> check(String[] s, Predicate<String> n, Predicate<String> r) {
        ArrayList<String> strings = new ArrayList<>();
        for (String str : s) {
            n.and(r).test(str);
        }
        return strings;
    }
}
