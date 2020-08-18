package com.io.java;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 实现指定位置插入
 * seek
 * */
public class IOTest15 {
    @Test
    public void test01() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("src\\com\\io\\java\\files\\test08.txt", "rw");
        rw.seek(1000);
        rw.write("赵庆贺".getBytes());
        rw.close();
    }

    @Test
    public void test02() throws IOException {
        File file = new File("src\\com\\io\\java\\files\\test08.txt");
        RandomAccessFile rw = new RandomAccessFile(file, "rw");
        rw.seek(3);

        StringBuilder stringBuilder = new StringBuilder((int) file.length());
        byte[] bytes = new byte[5];
        int len;
        while ((len = rw.read(bytes)) != -1) {
            stringBuilder.append(new String(bytes, 0, len));
        }

        rw.seek(3);
        rw.write("ttt".getBytes());

        rw.write(stringBuilder.toString().getBytes());


        rw.close();
    }
}
