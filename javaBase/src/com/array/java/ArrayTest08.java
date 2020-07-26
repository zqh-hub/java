package com.array.java;

import java.util.Arrays;

// Arrays
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0};
        int[] arr2 = {1, 2, 3, 0};

        // boolean .equals:比较两个数据是否相等
        boolean res = Arrays.equals(arr1, arr2);
        System.out.println(res);

        //void .fill(arr,val)：将val填充到arr中,将原有的值全部覆盖
        Arrays.fill(arr1, 30);
        System.out.println(Arrays.toString(arr1));//[30,30,30]

        //void sort(arr):排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // int .binarySearch(arr,val)：二分法查找，返回值>0是找到了
        int[] arr3 = {-90, -56, 99, 34, 10, 1000, 23};
        int ress = Arrays.binarySearch(arr3, 99);
        System.out.println(ress);
    }
}
