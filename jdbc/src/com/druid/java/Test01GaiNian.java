package com.druid.java;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

/*
 * Druid
 * 1、导入jar包：druid-1.0.9.jar
 * 2、配置文件xxx.properties
 * 3、获取数据库连接池对象：通过工厂类：DruidDateSourceFactory
 * */
public class Test01GaiNian {
    public static void main(String[] args) throws Exception {
        // 1、加载配置文件
        ClassLoader loader = Test01GaiNian.class.getClassLoader();
        URL url = loader.getResource("druid.properties");
        String path = url.getPath();
        FileReader file = new FileReader(path);
        //FileReader file = new FileReader("jdbc/src/druid.properties");
        Properties pro = new Properties();
        pro.load(file);
        file.close();

        // 2、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        // 3、获取连接
        Connection con = dataSource.getConnection();
        System.out.println(con);
    }
}
