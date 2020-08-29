package com.jdbc.java;

/*
 * jdbc各个对象的详解
 *   1、DriverManager:驱动管理对象
 *   2、Connection：数据库连接对象
 *   3、Statement：执行sql的对象
 *   4、ResultSet：结果集对象
 *   5、PreparedStatement：
 * */
public class JDBCTest02 {
    public static void main(String[] args) {
        // DriverManager
        /*
         *  1、注册驱动
         *   public static void registerDriver(Driver driver,DriverAction da)
         *   Class.forName("com.mysql.jdbc.Driver")在加载Driver时，Driver的静态代码块就会被执行，调用registerDriver()方法进而注册驱动
         *  2、获取数据库连接
         *   private static Connection getConnection(url,username,pwd)
         *   url:如果连接的是本机的mysql(3306),url可简写为：jdbc:mysql:///jdbc
         * */

        // Connection
        /*
         * Connection:数据库连接对象
         *   1、获取执行sql的对象
         *       > Statement createStatement()
         *       > PreparedStatement preparedStatement(String sql)
         *   2、管理事务
         *       > 开启事务：void setAutoCommit(boolean autoCommit):调用该方法，设置参数为false,开启事务
         *       > 提交事务：void commit()
         *       > 回滚事务：rollback()
         * */

        // Statement
        /*
         * Statement:执行静态sql
         *   1、执行sql
         *     > boolean execute(String sql)
         *     > int executeUpdate(String sql):执行DML(insert、update、delete)语句、DDL(crate、alter、drop)语句
         *     > ResultSet executeQuery(String sql):执行DQL(select)语句
         * */

        // ResultSet
        /*
        * next():游标向下移动一行
        * getXxx(参数):获取数据
        *   > Xxx：代表数据类型
        *   > 参数：
        *        > int:编号，从1开始
        *        > String:列的名称
        *
        * 注意：使用步骤：
        *   >
        * */
    }
}
