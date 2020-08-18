package com.io.java;

import org.junit.Test;

import java.io.*;

/*
 * 缓冲流：
 *
 * */
public class IOTest06 {
    @Test
    public void test01() {
        File src = new File("src\\com\\io\\java\\files\\ronan.jpg");
        File dest = new File("src\\com\\io\\java\\files\\ronan_buffer.jpg");

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);

            inputStream = new BufferedInputStream(fileInputStream);
            outputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[1024];
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
//            closee(outputStream);
        }
    }

    public void closee(Closeable o){
        if (o != null){
            try {
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
