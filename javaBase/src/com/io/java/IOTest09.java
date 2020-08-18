package com.io.java;

import org.junit.Test;

import java.io.*;

public class IOTest09 {
    @Test
    public void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src\\com\\io\\java\\files\\test01.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\io\\java\\files\\test05.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");

        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
