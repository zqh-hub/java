package com.io.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 转换流
 * */
public class IOTest08 {
    @Test
    public void test01() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src\\com\\io\\java\\files\\test01.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");

        char[] chars = new char[5];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            String string = new String(chars, 0, len);
            System.out.println(string);
        }


        inputStreamReader.close();
        fileInputStream.close();
    }
}
