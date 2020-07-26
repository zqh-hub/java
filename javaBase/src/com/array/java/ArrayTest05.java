package com.array.java;
// 数组的复制与反转

import java.util.Arrays;

public class ArrayTest05 {
    public static void main(String[] args) {
        reserveArray();
    }

    // 反转
    public static void reserveArray() {
        String[] strs = {"jojo", "coco", "soso"};
        for (int i = 0; i < strs.length / 2; i++) {
            String temp = strs[i];
            strs[i] = strs[strs.length - 1 - i];
            strs[strs.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(strs));
    }

    // 复制
    public static void copyArray() {
        String[] strs = {"jojo", "coco", "soso"};
        String[] strsCopy = new String[strs.length];
        for (int i = 0; i < strsCopy.length; i++) {
            strsCopy[i] = strs[i];
        }
    }
}
