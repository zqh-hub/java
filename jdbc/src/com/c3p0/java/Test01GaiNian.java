package com.c3p0.java;

import org.junit.Test;

/*
 * 数据库连接池：
 *   > 当系统初始化好后，容器被创建，容器中会申请一些连接对象，从容器中获取连接对象，
 *       用户访问完后，再将连接对象归还容器
 * 好处：
 *   > 节约资源
 *   > 用户访问高效
 *
 * 实现：
 *  1、标准接口：DataSource javax.sql包下
 *    > 方法：
 *          获取连接：getConnection()
 *          归还连接：Connection.close()--->并不是关闭，而是归还
 *  2、数据库厂商：C3P0,Druid
 * */
public class Test01GaiNian {
}
