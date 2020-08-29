package com.jdbc.java;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 练习：增删改
 * */
public class JDBCTest03 {
    // insert
    @Test
    public void test() {
        Statement statement = null;
        Connection mysql = null;
        try {
            // 1、注册
            Class.forName("com.mysql.jdbc.Driver");
            // 2、sql语句
            String sql = "insert into person value(3,\"小来\",23,\"女\")";
            // 3、获取连接
            mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
            // 4、获取执行对象
            statement = mysql.createStatement();
            // 5、执行sql
            int res = statement.executeUpdate(sql);
            // 6、处理结果
            System.out.println(res);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (mysql != null) {
                try {
                    mysql.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
