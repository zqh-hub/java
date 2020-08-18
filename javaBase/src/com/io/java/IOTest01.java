package com.io.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 流的分类：
 *   流向：输入流、输出流
 *   角色：节点流、处理流
 *   数据单位：字节流、字符流
 *
 * 流的体系：
 *   抽象基类                    节点流(文件流)                 缓冲流（处理流的一种）
 *   InputStream                FileInputStream             BufferedInputStream
 *   OutputStream               FileOutPutStream            BufferedOutputStream
 *   Reader                     FileReader                  BufferedReader
 *   Writer                     FileWriter                  BufferedWriter
 * */
public class IOTest01 {
    @Test
    public void test01(){
        File file = new File("src\\com\\io\\java\\files\\test01.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int read = fileReader.read();
            while (read != -1) {
                System.out.println((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
