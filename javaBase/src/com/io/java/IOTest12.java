package com.io.java;

import org.junit.Test;

import java.io.*;

/*
 * 对象流：
 *   用于存储和读取基本数据类型数据或对象的处理流
 *
 * 对象的系列化与反序列化：
 *   序列化：将内存中的java对象保存到磁盘中或通过网络传输出去
 * */
public class IOTest12 {
    @Test
    // 序列化
    public void test01() {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\io\\java\\files\\test.dd");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            String s = new String("魁拔之殊途");
            objectOutputStream.writeObject(s);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    // 反序列化
    public void test02() {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\com\\io\\java\\files\\test.dd");
            objectInputStream = new ObjectInputStream(fileInputStream);

            Object o = objectInputStream.readObject();
            String data = (String) o;
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
