package com.array.java;

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int stuNum = scan.nextInt();
        int[] scores = new int[stuNum];
        System.out.println("请输入" + stuNum + "个学生的成绩：");
        for (int i = 0; i < stuNum; i++) {
            scores[i] = scan.nextInt();
        }
        //最大值
        int max = 0;
        for (int i = 0; i < stuNum; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("最高分：" + max);
        char level;
        for (int i = 0; i < stuNum; i++) {
            if (max - scores[i] <= 10) {
                level = 'A';
            } else if (max - scores[i] <= 20) {
                level = 'B';
            } else {
                level = 'D';
            }

            System.out.println("student " + i + "score is " + scores[i] + ",grade is " + level);
        }
    }
}
