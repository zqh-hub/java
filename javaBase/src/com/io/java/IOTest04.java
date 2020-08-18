package com.io.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 读入并写出
 * */
public class IOTest04 {
    @Test
    public void test01() {
        File src = new File("src\\com\\io\\java\\files\\test03.txt");
        File dest = new File("src\\com\\io\\java\\files\\test01.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(src);
            char[] chars = new char[6];
            int len;
            fileWriter = new FileWriter(dest);
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
