package com.exception.java;

import org.junit.Test;

/*
 * try{
 *   xxx
 * }catch(异常类型 变量){
 *   xx
 * }finally{
 *   xxx
 * }
 *
 * 及时有return语句，finally也会被执行
 * */
public class ExceptionTest01 {
    @Test
    public void test(){
        int num = test01();
        System.out.println(num);
    }
    public int test01() {
        String str = "abc";
        try{
            int i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("格式转化异常");
            return 0;
        }finally {
            System.out.println("finally");
        }
        return 2;
    }
}

