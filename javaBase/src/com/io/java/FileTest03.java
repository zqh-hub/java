package com.io.java;

import org.junit.Test;

import java.io.File;

/*
 * File的方法2：
 *
 * */
public class FileTest03 {
    @Test
    public void test01() {
        File file = new File("D:\\document\\java\\javaBase\\src\\com\\io\\java\\files\\test02.txt");

        //isFile():是否是文件
        boolean isf = file.isFile();

        // isDirectory():是否是文件夹
        boolean isd = file.isDirectory();

        // isHidden():是否是隐藏
        boolean hidden = file.isHidden();

        // exists():是否存在
        boolean exists = file.exists();

        // canRead()/canWrite():是否可读可写
        boolean r = file.canRead();
        boolean w = file.canWrite();

        System.out.println(isf);
        System.out.println(isd);
        System.out.println(hidden);
        System.out.println(exists);
        System.out.println(r);
        System.out.println(w);

    }
}
