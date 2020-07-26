package com.array.java;

/*
 * 二维数组
 *
 *
 * */
public class ArrayTest03 {
    public static void main(String[] args) {
        /*---------------   一、二维数组的声明和初始化   ---------------*/
        //1.1 静态初始化
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        int[][] nums = {{1, 2, 3}, {3, 4, 5}};
        //1.2 动态初始化
        String[][] strs1 = new String[3][2];
        String[][] strs2 = new String[3][];

        /*---------------   二、二维数组的调用   ---------------*/
        System.out.println(arr[0][2]);

        /*---------------   三、二维数组的长度   ---------------*/
        int len = arr.length;
        System.out.println(len);

        /*---------------   四、二维数组的遍历   ---------------*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        /*---------------   五、二维数组默认初始化值   ---------------*/
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        System.out.println(arr1);    //地址值：[[I@4554617c
        System.out.println(arr1[0]);     //地址值:[I@74a14482

        int[][] arr2 = new int[3][2];
        System.out.println(arr2);   //地址值：[[I@1540e19d
        System.out.println(arr2[0]); //地址值：[I@677327b6

        int[][] num = new int[3][];
        System.out.println(num[0]); //null:因为没有初始化值
    }

}
