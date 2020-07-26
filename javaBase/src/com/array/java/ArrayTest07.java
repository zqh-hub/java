package com.array.java;

import java.util.Arrays;

// 冒泡排序
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {-45, -23, 0, 3, 56, 78, 23, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
