package com.functionInterface.java;

import java.util.function.Predicate;

public class FunInterfaceTest08 {

    public static void main(String[] args) {
        boolean c1 = checkString("kuiba", s -> s.length() > 9);
        System.out.println(c1);

        boolean c2 = checkString("kuiba", s -> s.length() > 2, s -> s.length() > 9);
        System.out.println(c2);
    }

    public static boolean checkString(String s, Predicate<String> p) {
        return p.test(s);
    }

    public static boolean checkString(String s, Predicate<String> p, Predicate<String> pp) {

        /*boolean v1 = p.test(s);
        boolean v2 = pp.test(s);

        return v1 && v2;*/

        // and()
        return p.and(pp).test(s);
    }
}
