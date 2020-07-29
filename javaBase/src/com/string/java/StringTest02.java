package com.string.java;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        reverse();
    }
    // 字符反转
    public static void reverse(){
        String str = "123";
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        System.out.println(s);
    }

    // 统计大小写个数
    public static void num() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > 'A' && str.charAt(i) < 'Z'){

            }else if(str.charAt(i) > 'a' && str.charAt(i) < 'z'){

            }
        }
    }

    // 遍历字符串
    public static void str() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入：");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
