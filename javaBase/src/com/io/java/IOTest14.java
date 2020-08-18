package com.io.java;
/*
 *
 * */

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOTest14 {
    @Test
    public void test() throws IOException {
        File file = new File("src\\com\\io\\java\\files\\ronan.jpg");
        File file1 = new File("src\\com\\io\\java\\files\\ronan01.jpg");

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(file1, "rw");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = randomAccessFile.read(bytes)) != -1) {
            randomAccessFile1.write(bytes, 0, len);
        }

        randomAccessFile1.close();
        randomAccessFile.close();
    }
}
