package com.io.java;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest03 {
    @Test
    public void test01() {
        File file = new File("src\\com\\io\\java\\files\\test03.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("I have a dream\n");
            fileWriter.write("I have a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
