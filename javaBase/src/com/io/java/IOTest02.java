package com.io.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOTest02 {
    @Test
    public void test01(){
        File file = new File("src\\com\\io\\java\\files\\test01.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] chars = new char[6];
            int data = fileReader.read(chars);
            while (data != -1) {
                for (int i = 0; i < data; i++) {
                    System.out.print(chars[i]);
                }
                data = fileReader.read(chars);
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
