package com.io.java;
/*
 * 创建/删除硬盘中的文件或目录
 *  boolean createNewFile()：创建文件
 *  boolean mkdir():创建目录
 *  boolean mkdirs():创建目录
 * */

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest04 {
    @Test
    public void test01() throws IOException {
        File file = new File("D:\\document\\java\\javaBase\\src\\com\\io\\java\\files", "test01.txt");
        if (!file.exists()) {
            // createNewFile()：创建文件
            file.createNewFile();
            System.out.println("创建成功");
        }else {
            file.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test02(){

    }
}
