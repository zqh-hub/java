package com.io.java;

import org.junit.Test;

import java.io.*;

public class IOTest07 {
    @Test
    public void test01() {
        File srcFile = new File("src\\com\\io\\java\\files\\test01.txt");
        File destFile = new File("src\\com\\io\\java\\files\\test04.txt");

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            FileReader fileReader = new FileReader(srcFile);
            FileWriter fileWriter = new FileWriter(destFile);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            // 方式1：
            /*
            char[] chars = new char[1024];
            int len;

            while ((len = bufferedReader.read(chars)) != -1) {
                bufferedWriter.write(chars, 0, len);
            }*/

            // 方式2:
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                // bufferedWriter.write(data+"\n");
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
