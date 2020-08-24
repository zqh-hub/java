package com.functionInterface.java;

import java.util.function.Supplier;

public class FunInterfaceTest04 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 3};
        int max = getMax(() -> {
            int m = ints[0];
            for (int i = 1; i < ints.length; i++) {
                if (m < ints[i]) {
                    m = ints[i];
                }
            }
            return m;
        });

        System.out.println(max);
    }

    public static int getMax(Supplier<Integer> i) {
        return i.get();
    }
}
