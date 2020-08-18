package com.io.java;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 打印流
 * */
public class IOTest11 {
    @Test
    public void test() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\io\\java\\files\\test01.txt");
        PrintStream printStream = new PrintStream(fileOutputStream, true);
        if (printStream != null) {
            System.setOut(printStream);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(1);
        }
    }
}
