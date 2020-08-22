package com.map.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MapTest05 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("D:\\document\\java\\javaBase\\src\\com\\map\\java\\jdbc.properties");
        properties.load(fis);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");

        System.out.println(user + "," + pwd);
    }
}
