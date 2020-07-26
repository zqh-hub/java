package com.array.java;

// 查找
public class ArrayTest06 {
    public static void main(String[] args) {
        // lineFind();
        twoFind();
    }

    // 二分法查找：前提是有序
    public static void twoFind() {
        int[] nums = {-89, -34, 1, 3, 67, 99};

        int dest = 3;
        int head = 0;
        int end = nums.length - 1;
        boolean flag = true;

        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest == nums[middle]) {
                System.out.println("找到了！，下标是" + middle);
                flag = false;
                break;
            } else if (dest > nums[middle]) {
                head = middle + 1;
            } else if (dest < nums[middle]) {
                end = middle - 1;
            }
        }
        if (flag) {
            System.out.println("没找到");
        }
    }

    // 线性查找
    public static void lineFind() {
        String[] str = {"jojo", "coco", "vovo", "zozo"};
        String dest = "coco";
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if ("coco".equals(str[i])) {
                System.out.print("找到了！，下标为：" + i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("没找到。。。。");
        }
    }
}
