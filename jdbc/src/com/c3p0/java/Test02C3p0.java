package com.c3p0.java;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/*
* C3P0:
*   > 导入java包：c3p0-0.9.5.2.jar、mchange-commons-java-0.2.12.jar、mysql-connector-java-5.1.37-bin.jar
*   > 定义配置文件src下:c3p0.properties 或者 c3p0-config.xml
*
* */
public class Test02C3p0 {
    public static void main(String[] args) throws SQLException {
        // 1、创建数据库连接池对象
        ComboPooledDataSource dsPool = new ComboPooledDataSource();
        // 2、获取连接对象
        Connection con = dsPool.getConnection();

        System.out.println(con);
    }
}
