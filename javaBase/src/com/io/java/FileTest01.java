package com.io.java;

import org.junit.Test;

import java.io.File;

/*
 * File三种构造器：
 *   1、new File(pathname);
 *   2、new File(parent,child)
 * */
public class FileTest01 {
    @Test
    public void test01() {
        // 构造器1：
        File file1 = new File("test01.txt");
        System.out.println(file1);

        // 构造器2：
        File file2 = new File("D:\\document\\java\\javaBase\\src\\com\\io\\java", "files");
        System.out.println(file2);

        //构造器3：
        File file3 = new File(file2, "test02.txt");
        System.out.println(file3);
    }
}
