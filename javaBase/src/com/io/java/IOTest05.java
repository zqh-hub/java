package com.io.java;
/*
 * 字节流对图片进行复制
 * */

import org.junit.Test;

import java.io.*;

public class IOTest05 {
    @Test
    public void test01() {
        File file = new File("src\\com\\io\\java\\files\\ronan.jpg");
        File fileCp = new File("src\\com\\io\\java\\files\\ronan_cp.jpg");

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(fileCp);

            byte[] bytes = new byte[100];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
