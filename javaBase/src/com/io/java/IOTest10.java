package com.io.java;
/*
* 标准输入流
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String data = bufferedReader.readLine();
            if (data.equalsIgnoreCase("e")) {
                System.out.println("结束");
                break;
            }

            String s = data.toUpperCase();
            System.out.println(s);
        }
    }
}
