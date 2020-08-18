package com.io.java;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.util.Arrays;

/*
 * File的方法：
 *
 *  getAbsoluteFile():获取绝对路径
 *  getPath()：获取路径
 *  getName()：
 *  getParent()：
 *  length()：获取文件的长度（字节）
 *  lastModified()：获取最后修改时间
 *
 *  String[] list():获取指定目录下的所有文件或者文件目录的名称数组
 *  File[] listFiles():
 *
 *  renameTo():重命名
 * */
public class FileTest02 {
    @Test
    public void test01() {
        File file = new File("test01.txt");
        File file1 = new File("D:\\document\\java\\javaBase\\src\\com\\io\\java\\files", "test02.txt");

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        System.out.println("*****************************");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }

    @Test
    public void test02() {
        File file = new File("C:\\Users\\Administrator\\Desktop");

        //String list()
        String[] list = file.list();
        System.out.println(Arrays.toString(list));

        //File listFiles()
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    @Test
    public void test03(){
        File file = new File("test01.txt");
        File file1 = new File("D:\\document\\java\\javaBase\\src\\com\\io\\java\\files", "test02.txt");

        //renameTo():file要真实存在，file1不要存在
        boolean b = file.renameTo(file1);
        System.out.println(b);
    }
}
