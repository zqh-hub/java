package com.jdbcUtils.java;
/*
 * 自己封装utils
 *   1、封装注册驱动
 *   2、封装close
 * */

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class MyUtils {
    private static String url;
    private static String user;
    private static String pwd;
    private static String driver;

    /*
     * 读取配置文件，注册数据库
     * */
    static {
        Properties pro = new Properties();
        try {
            ClassLoader classLoader = MyUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            pro.load(new FileReader("jdbc/src/com/jdbcUtils/java/jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        user = pro.getProperty("user");
        url = pro.getProperty("url");
        pwd = pro.getProperty("pwd");
        driver = pro.getProperty("driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
     * 实现连接
     * */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    /*
     * 关闭连接
     * */
    public static void close(Statement state, Connection con) {
        if (state != null) {
            try {
                state.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement state, Connection con) {
        if (state != null) {
            try {
                state.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
