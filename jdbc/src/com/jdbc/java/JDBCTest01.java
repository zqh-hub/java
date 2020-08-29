package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 快速入门：
 *   1、导入驱动jar包
 * */
public class JDBCTest01 {
    public static void main(String[] args) throws Exception {
        // 2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 3、获取数据库连接对象
        Connection mysql = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "123456");
        // 4、定义sql语句
        String update = "update person set age=100 where id = 1";
        // 5、获取执行sql的对象
        Statement statement = mysql.createStatement();
        // 6、执行sql
        int res = statement.executeUpdate(update);
        // 7、处理结果
        System.out.println(res);
        // 8、释放资源
        statement.close();
        mysql.close();
    }
}
