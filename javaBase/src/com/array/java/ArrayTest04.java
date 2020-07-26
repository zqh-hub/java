package com.array.java;

// 杨辉三角
public class ArrayTest04 {
    public static void main(String[] args) {
        int[][] nums = new int[10][];
        for (int i = 0; i < nums.length; i++) {
            // 声明
            nums[i] = new int[i + 1];
            // 首末赋值
            nums[i][0] = 1;
            nums[i][i] = 1;
            // 非首末元素
            if (i > 1) {
                for (int j = 1; j < nums[i].length - 1; j++) {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
