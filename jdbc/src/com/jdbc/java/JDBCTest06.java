package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 练习：创建表
 * */
public class JDBCTest06 {
    public static void main(String[] args) throws Exception {
        String sql = "create table stu(id int primary key,name varchar(100))";
        Class.forName("com.mysql.jdbc.Driver");
        Connection mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
        Statement state = mysql.createStatement();
        int res = state.executeUpdate(sql);
        System.out.println(res);
        state.close();
        mysql.close();
    }
}
