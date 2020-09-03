package com.druid.java;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * Druid连接池，定义工具类
 * */
public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            // 加载配置文件
            ClassLoader loader = JDBCUtils.class.getClassLoader();
            URL url = loader.getResource("druid.properties");
            String path = url.getPath();
            FileReader file = new FileReader(path);
            Properties pro = new Properties();
            pro.load(file);
            file.close();
            // 获取DataSource
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 获取连接
     * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

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

    public static void close(ResultSet rs, Statement state, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
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


    /*
     * 获取连接池
     * */

    public static DataSource getDs() {
        return ds;
    }
}
