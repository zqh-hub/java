package com.debug.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class DebugTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数： ");
        int x = scan.nextInt();
        System.out.print("请输入第二个整数： ");
        int y = scan.nextInt();
        int max = getMax(x, y);
        System.out.println(max);
    }

    public static int getMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
